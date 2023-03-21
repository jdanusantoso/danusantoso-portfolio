import React from 'react';
import './App.css';
import Home from './Components/Home/Home';
import Header from './Components/Header/Header';
import Footer from './Components/Footer/Footer';
import { BrowserRouter, Routes, Route } from "react-router-dom";
import SearchPage from './Components/SearchPage/SearchPage';


function App() {
  return (
    // BEM
    <div className="app">
      <BrowserRouter>
        <Header />
        
        <Routes>
          <Route path="/search">
            <SearchPage />
          </Route>
          <Route path="/">
            <Home />
          </Route>
        </Routes>
        
        <Footer />
      </ BrowserRouter>
    </div>
  );
}

export default App;
