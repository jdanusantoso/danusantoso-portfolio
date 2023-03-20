const API_KEY = "a1ccd30aa9be3803bf521e1ba80eee66";

const requests = {

     fetchTrending: `/trending/all/week?api_key=${API_KEY}&language=en-US`,
	 fetchNetflixOriginals: `/discover/tv?api_key=${API_KEY}&with_network=123`,
	 fetchTopRated: `/movie/top_rated?api_key=${API_KEY}&language=en-US`,
	 fetchActionMovies: `/discover/movie?api_key=${API_KEY}&with_genres=28`,
	 fetchComedyMovies: `/discover/movie?api_key=${API_KEY}&with_genres=35`,
	 fetchHorrorMovies: `/discover/movie?api_key=${API_KEY}&with_genres=27`,
	 fetchRomanceMovies: `/discover/movie?api_key=${API_KEY}&with_genres=10749`,
	 fetchDocumentaries: `/discover/movie?api_key=${API_KEY}&with_genres=99`

}

export default requests;