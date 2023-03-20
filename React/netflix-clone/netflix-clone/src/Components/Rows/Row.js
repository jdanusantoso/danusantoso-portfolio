import React, { useState, useEffect } from 'react'
import instance from '../Instance/instance';
import YouTube from 'react-youtube';
import movieTrailer from 'movie-trailer';
import "./Row.css";


const base_url = "https://image.tmdb.org/t/p/w500"

function Row({ title, fetchUrl, isLargeRow }) {
  const [movies, setMovies] = useState([]);
  const [poster_path, setPoster_path] = useState([]);
  const [trailerUrl, setTrailerUrl] = useState("");
  useEffect(() => {

    async function fetchData() {

      try{
      const request = await instance.get(fetchUrl);
      setMovies(request.data.results);
      setPoster_path(request.data.moviePoster);
      console.log(request);
      return request;
      
      }catch (error){
        console.log(error);
      }

      
      
    }
    fetchData();
  }, [fetchUrl]);

  const opts = {
    height: "390",
    width: "99%",
    playerVars: {
      autoplay: 0,
    }
  }

  const handleClick = (movie) => {
    // console.table(movie?.title)
    if (trailerUrl) {
      setTrailerUrl('')
    } else {
      movieTrailer(movie?.title || "")
        .then(url => {
          const urlParams = new URLSearchParams(new URL(url).search);
          setTrailerUrl(urlParams.get('v'));
        }).catch((error) => console.log(error));
    }
  }


  return (
    <div className="row">
      <h2>{title}</h2>
      <div className="row_posters">
        {movies.map(movie => {
          return <img
            key={movie.id}
            onClick={() => handleClick(movie)}
            className={`row_poster ${isLargeRow && "row_posterLarge"}`}
            src={`${base_url}${isLargeRow ? movie.poster_path : movie.backdrop_path}`}
            alt={movie.name} />
        })}
      </div>
      <div style={{ padding: "40px" }}>
        {trailerUrl && <YouTube videoId={trailerUrl} opts={opts} />}
      </div>
    </div>
  );
}

export default Row;