import React from 'react';
import {useState,useEffect} from 'react';
import { BrowserRouter as Router, Route, Switch } from "react-router-dom";
import Header from './components/Header';
import NavBar from './components/NavBar';
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
      </>
    </Router>
  );
}

export default App;
