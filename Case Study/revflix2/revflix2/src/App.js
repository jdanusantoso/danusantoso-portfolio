import React, { useEffect } from "react";
import "./App.css";
import Header from "./Components/Header/Header";
import Home from "./Components/Home/Home";
import { BrowserRouter as Router, Switch, Route, BrowserRouter } from "react-router-dom";
import Checkout from "./Components/Checkout/Checkout";
import Login from "./Components/Login/Login";
import { useStateValue } from "./Components/ContextAPI/StateProvider";
import { auth } from './firebase';
import { loadStripe } from "@stripe/stripe-js";
import { Elements } from "@stripe/react-stripe-js"
import Payment from "./Components/Payment/Payment";
import Orders from "./Components/Orders/Orders";

const promise = loadStripe ("pk_test_51MjVp3EgJxIABMiqhflNvE62Cn9mMP4DNLEKleJwdVlvYtHX2O65Jhh2Kgh6WmwEUdlaIS4ZJgnYmQjFfDZVKdjo00Q3A3FULp");

function App() {
  const [{}, dispatch] = useStateValue();

  useEffect(() => {

    auth.onAuthStateChanged(authUser => {
      console.log('THE USER IS >>> ', authUser);

      if (authUser) {

        dispatch({
          type: 'SET_USER',
          user: authUser
        })
      } else {
        dispatch({
          type: 'SET_USER',
          user: null
        })
      }
    })
  }, [])

  return (
    // BEM
    
    <Router>
      <div className="app">
        

        <Switch>
         <Route path="/orders">
            <Header />
            <Orders />
          </Route> 
        <Route path="/login">
            <Login />
          </Route>
          <Route path="/checkout">
            <Header />
            <Checkout />
          </Route>
          <Route path="/Payment">
            <Header />
            <Elements stripe ={promise}>
              <Payment />
            </Elements>
          </Route>
          <Route path="/">
            <Header />
            <Home />
          </Route>
        </Switch>
      </div>
    </Router>
  );
}

export default App;
