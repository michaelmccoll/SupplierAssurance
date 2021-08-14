import React from 'react';
import {useState,useEffect} from 'react';
import { BrowserRouter as Router, Route, Switch } from "react-router-dom";
import Home from './containers/Home';
import Header from './components/Header';
import NavBar from './components/NavBar';
import Error from './containers/Error';
import Suppliers from './containers/Suppliers';
import Assessors from './containers/Assessors';
import Reviews from './containers/Reviews';
import Issues from './containers/Issues';
import Settings from './containers/Settings';
import './App.css';

function App() {

  const [data, setData] = useState([])
  const [loaded, setLoaded] = useState(false)

  const getData = () => {
    fetch(`http://player-rater.herokuapp.com/organisations`)
    .then(res => res.json())
    .then(data => {
      setData(data)
    })
    .then(() => setLoaded(true))}

  useEffect(()=>{
    getData();
  },[])

  return (
    <Router>
      <>
        <Header/>
        <NavBar/>
        <Switch>
          <Route path="/">
            <Home/>
          </Route>
          <Route path="/suppliers">
            <Suppliers/>
          </Route>
          <Route path="/assessors">
            <Assessors/>
          </Route>
          <Route path="/reviews">
            <Reviews/>
          </Route>
          <Route path="/issues">
            <Issues/>
          </Route>
          <Route path="/settings">
            <Settings/>
          </Route>
        <Route component={Error}/>
        </Switch>
      </>
    </Router>
  );
}

export default App;
