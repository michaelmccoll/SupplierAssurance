import React from 'react';
import {useState,useEffect} from 'react';
import { BrowserRouter as Router, Route, Switch } from "react-router-dom";
import Header from './components/Header';
import NavBar from './components/NavBar';
import Home from './containers/Home';
import Error from './containers/Error';
import Suppliers from './containers/Suppliers';
import Assessors from './containers/Assessors';
import Reviews from './containers/Reviews';
import Issues from './containers/Issues';
import Settings from './containers/Settings';
import './App.css';

function App() {

  const [OrgData, setOrgData] = useState([])
  const [loaded, setLoaded] = useState(false)

  const getOrgData = () => {
    fetch(`http://localhost:8080/organisations`)
    .then(res => res.json())
    .then(data => {
      setOrgData(data)
    })
    .then(() => setLoaded(true))}

  useEffect(()=>{
    getOrgData();
  },[])

  return (
    <Router>
      <>
        <Header/>
        <NavBar/>
        <Switch>
        <Route exact path="/">
          <Home data={OrgData} loaded={loaded}/>
        </Route>

        <Route path="/suppliers">
          <Suppliers data={OrgData} loaded={loaded}/>
        </Route>

        <Route path="/assessors">
          <Assessors data={OrgData} loaded={loaded}/>
        </Route>

        <Route path="/reviews">
          <Reviews data={OrgData} loaded={loaded}/>
        </Route>

        <Route path="/issues">
          <Issues data={OrgData} loaded={loaded}/>
        </Route>

        <Route path="/settings">
          <Settings data={OrgData} loaded={loaded}/>
        </Route>
        
        <Route component={Error}/>
        </Switch>
      </>
    </Router>
  );
}

export default App;
