import React, { useEffect, useState } from "react";
import './App.css';
import Login from './Components/Login/Login.jsx';
import { getTokenFromUrl } from './Components/Spotify/Spotify';
import SpotifyWebApi from "spotify-web-api-js";
import Player from "./Components/Player/Player";
import { useDataLayerValue } from "./Components/DataLayer/DataLayer";

const spotify = new SpotifyWebApi();

function App() {
  const [{user, token}, dispatch] = useDataLayerValue();

  //Pull information and dispatch
  //pull user from anywhere 
  useEffect(() => {
    // Set token
    const hash = getTokenFromUrl();

    //clear the hash
    window.location.hash = "";

    //_means temporary
    let _token = hash.access_token;

    //Pass in the token
    if (_token) {
      spotify.setAccessToken(_token);
    
    //if there is a token, set the token  
      dispatch({
        type: "SET_TOKEN",
        token: _token,
      });

      spotify.getPlaylist("37i9dQZEVXcSAGqiDEnqMF").then((response) =>
        dispatch({
          type: "SET_DISCOVER_WEEKLY",
          discover_weekly: response,
        })
      );

      spotify.getMyTopArtists().then((response) =>
        dispatch({
          type: "SET_TOP_ARTISTS",
          top_artists: response,
        })
      );

      dispatch({
        type: "SET_SPOTIFY",
        spotify: spotify,
      });

      //Connect spotify to react
      //get the user account and returns a promise
      spotify.getMe().then((user) => {
        dispatch({
          type: "SET_USER",
          user,
        });
      });

      spotify.getUserPlaylists().then((playlists) => {
        dispatch({
          type: "SET_PLAYLISTS",
          playlists,
        });
      });
    }
    //run once or you could a variable and it will run once when that variable changes
    //many other variables
  }, [token, dispatch]);

  return (
    <div className="app">
      {!token && <Login />}
      {token && <Player spotify={spotify} />}
    </div>
  );
}

export default App;