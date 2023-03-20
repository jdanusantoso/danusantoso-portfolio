import React, { useState, useEffect } from 'react';
import './App.css';
import Row from './Components/Rows/Row';
import requests from './request';
import NavBar from './Components/NavBar/NavBar';
import Banner from './Components/Banner/Banner';

function App() {
//When the row loads, pull info from tmdb
  

  return (
    
    <div className="App">
      { /*fetch url from the request page*/  }

      <NavBar /> 
      <Banner />
      <Row title="NETFLIX ORIGINALS" 
      fetchUrl={requests.fetchNetflixOriginals}
      isLargeRow 
      />
      <Row title="Trending Now" fetchUrl={requests.fetchTrending} />
      <Row title="Top Rated" fetchUrl={requests.fetchTopRated} />  
      <Row title="Action Movies" fetchUrl={requests.fetchActionMovies} />
      <Row title="Comedy Movies" fetchUrl={requests.fetchComedyMovies} />
      <Row title="Horror Movies" fetchUrl={requests.fetchHorrorMovies} />
      <Row title="Romance Movies" fetchUrl={requests.fetchRomanceMovies} />
      <Row title="Documentaries" fetchUrl={requests.fetchDocumentaries} /> 
    </div>
  );
}

export default App;
