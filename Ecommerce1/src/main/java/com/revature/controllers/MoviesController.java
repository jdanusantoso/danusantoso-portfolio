package com.revature.controllers;

import com.revature.models.Orders;
import com.revature.repositories.MoviesRepository;
import com.revature.models.Movies;
import com.revature.service.MoviesService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController //This combines @Controller and @ResponseBody
@CrossOrigin //lets us take in HTTP requests (might have to specify ports in your P2)
@RequestMapping(value="/movies")
@AllArgsConstructor
public class MoviesController {

    @Autowired
    private final MoviesService moviesService;


    //HTTP Requests-------------------------------

    @GetMapping(value="/getAllMovies")
    //url: localhost:5556/data/movies/getAllMovies
    public ResponseEntity<List<Movies>> getAllAccounts(){

        return ResponseEntity.ok(moviesService.getAllMovies()); //.ok() returns a 200 level status code

    }

    @GetMapping(value="/{genre}")
    //url : localhost:5556/data/movies/{genre}
    public ResponseEntity<List<Movies>> findByGenre(@PathVariable String genre){

        return ResponseEntity.ok(moviesService.findByGenre(genre)); //.ok() returns a 200 level status code


    }

    @GetMapping(value="findBy/{genre}")
    //url : localhost:5556/data/movies/findby/{genre}
    public Movies/*ResponseEntity<List<Movies>> */findMovieByGenre(@PathVariable String genre){

        return moviesService.findMovieByGenre(genre);


    }

    @GetMapping(value="/{genre}/{title}")
//    // localhost:5556/data/movies/genre/title
    public Movies findByGenreAndMovie(Movies m, @PathVariable String genre, @PathVariable String title){
        return moviesService.getByGenreAndTitle(genre, title);
   }

    @PostMapping(value="/add")
    @ResponseStatus(HttpStatus.CREATED)
    //url : localhost:5556/data/orders/add
    public Movies /*ResponseEntity*/ addMovie(@RequestBody Movies m){
        return moviesService.save(m);
    }



}