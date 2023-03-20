//API Variables

const API_KEY = 'api_key=a1ccd30aa9be3803bf521e1ba80eee66';
const BASE_URL = 'https://api.themoviedb.org/3';
const API_URL = BASE_URL + '/discover/movie?sort_by=popularity.desc&'+API_KEY;
const IMG_URL = 'https://image.tmdb.org/t/p/w500';
const searchURL = BASE_URL + '/search/movie?' + API_KEY;

//Genres

const genres =[
    {
        "id": 28,
        "name": "Action"
      },
      {
        "id": 12,
        "name": "Adventure"
      },
      {
        "id": 16,
        "name": "Animation"
      },
      {
        "id": 35,
        "name": "Comedy"
      },
      {
        "id": 80,
        "name": "Crime"
      },
      {
        "id": 99,
        "name": "Documentary"
      },
      {
        "id": 18,
        "name": "Drama"
      },
      {
        "id": 10751,
        "name": "Family"
      },
      {
        "id": 14,
        "name": "Fantasy"
      },
      {
        "id": 36,
        "name": "History"
      },
      {
        "id": 27,
        "name": "Horror"
      },
      {
        "id": 10402,
        "name": "Music"
      },
      {
        "id": 9648,
        "name": "Mystery"
      },
      {
        "id": 10749,
        "name": "Romance"
      },
      {
        "id": 878,
        "name": "Science Fiction"
      },
      {
        "id": 10770,
        "name": "TV Movie"
      },
      {
        "id": 53,
        "name": "Thriller"
      },
      {
        "id": 10752,
        "name": "War"
      },
      {
        "id": 37,
        "name": "Western"
      }
]

//DOM Variables
const main = document.getElementById("main");
const form = document.getElementById("form");
const search = document.getElementById("search");

//Genre Variables

const tagsEl = document.getElementById('tags')

/**********************
 
 Genre Functions

**********************/
/* Setting up the buttons to click the genre*/

//House all the clicked genres
let selectedGenre = []
setGenre();

function setGenre() {
    tagsEl.innerHTML='';
    genres.forEach(genre => {
        //Creating the div
        const t = document.createElement('div');
        //for each, add the tag to t
        t.classList.add('tag');
        //send the id to the genre
        t.id = genre.id;
        //Set the genre
        t.innerText=genre.name;
        t.addEventListener('click', () => {
            //If empty,
            if(selectedGenre.length == 0) {
                //push it into the empty array
                selectedGenre.push(genre.id);
            }else {
                //If id is already there,
                if(selectedGenre.includes(genre.id)) {
                    //loop through each id and index (idx)
                    selectedGenre.forEach((id, idx)=> {
                        //If it is already there,
                        if(id == genre.id){
                            //remove by splicing that specific indes value
                            selectedGenre.splice(idx, 1);
                        }
                    })

                }else{
                    selectedGenre.push(genre.id)
                }
            }
                console.log(selectedGenre)
                //Getting info from the empty array as a string and concatenating together with url
                //EncodeURI allows fetching movies of that genre upon clicking on it
                getMovies(API_URL + '&with_genres=' + encodeURI(selectedGenre.join(',')));
                highlightSelection();
            
        })
        //Show on the screen
        tagsEl.append(t);
    })
}

/* Setting up in order to unhighlight the genres clicked*/

function highlightSelection(){
    //Select all the tags
    const tags =document.querySelectorAll('.tag');
    tags.forEach(tag => {
        //remove highlight from those classList that have it
        tag.classList.remove('highlight')
    })
    clearBTN()
    //If selected genre is not 0, 
    if(selectedGenre !=0) {
        //loop through each one
        selectedGenre.forEach(id => {
            //get the id
            const highlightedTag =document.getElementById(id);
            //add the highlighted element to that classlist
            highlightedTag.classList.add('highlight');
        })
    }
}

function clearBTN(){
    //Create clearBTN to avoid creating multiple clear btns from each click on genre
    let clearBTN =document.getElementById('clear');
    //If it exists, add highlight to its classlist
    if(clearBTN){
        clearBTN.classList.add('highlight')
    } else{
    //Create another div
    let clear = document.createElement('div');
    //Create a clear classList with tag and highlight elements added
    clear.classList.add('tag', 'highlight');
    //Create an id
    clear.id = 'clear';
    //Set the inner text to say clear
    clear.innerText = 'Clear x';
    clear.addEventListener('click', () => {
        //Reseting everything to the default dom
        selectedGenre = [];
        setGenre();
        getMovies(API_URL);
    })
    //Append to tags element
    tagsEl.append(clear);
    }
    
    
}

//FetchAPI Functions
getMovies(API_URL);

function getMovies(url) {
    //Fetch API: Pass in the URL through JSON, Getting the data, 
    fetch(url).then(res => res.json()).then(data => {
        console.log(data.results)
        //If the data results are more than 1, show movies
        if(data.results.length !==0){
            showMovies(data.results);
        //If not, show No Results Found
        }else{
            main.innerHTML=`<h1 l class="no-results">No Results Found<\h1>`
        }
            
           
        })
    }


function showMovies(data) {
    //incorporating a blank slate
    main.innerHTML = '';

    data.forEach(movie => {
        const {title, poster_path, vote_average, overview} = movie;
        const movieEl = document.createElement('div');
        movieEl.classList.add('movie');
        movieEl.innerHTML = 
            /*if the there is a poster, add the poster path; if not put a placeholder there*/
             `<img src="${poster_path? IMG_URL + poster_path: "https://roadmap-tech.com/wp-content/uploads/2019/04/placeholder-image.jpg" }" alt="${title}">
            <div class="movie-info">
                <h3>${title}</h3>
                <span class="${getColor(vote_average)}">${vote_average}</span>
            </div>
            <div class="overview">
                <h3>Overview</h3>
                ${overview}
            </div>
        
        `
        //Appending elements to the main tag
        main.appendChild(movieEl);

    })
}

function getColor(vote){
    if(vote >= 8) {
        return "green";
    }
    else if(vote >=5){
        return "orange";
    }

    else {
        return "red";
    }
}

form.addEventListener('submit', (e) => {
    e.preventDefault();

    const searchTerm = search.value;
    //Search movies within a specified genre
    selectedGenre = [];
    setGenre();

    if(searchTerm ) {
        getMovies(searchURL + '&query=' + searchTerm);
    }
    //Shows the default popular movies
    else{
        getMovies(API_URL);
    }
})