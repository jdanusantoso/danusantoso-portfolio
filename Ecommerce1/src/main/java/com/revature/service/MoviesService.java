package com.revature.service;

import com.revature.repositories.MoviesRepository;
import com.revature.exceptions.MovieDoesNotExistException;
import com.revature.models.Movies;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service("moviesService")
@RequiredArgsConstructor
public class MoviesService {

    private final MoviesRepository moviesRepository;


    public Movies save(Movies movie) {
       return moviesRepository.save(movie);
        }

    public List<Movies> getAllMovies() {
        return moviesRepository.findAll();
    }

    @Transactional
    public List<Movies>  findByGenre(String genre) {
        return moviesRepository.findByGenre(genre).orElseThrow(MovieDoesNotExistException::new);
   }

    public Movies findMovieByGenre(String genre) {
        return moviesRepository.findMovieByGenre(genre).orElseThrow(MovieDoesNotExistException::new);
    }

    public Movies getByGenreAndTitle(String genre, String title) {
        return moviesRepository.getByGenreAndTitle(genre, title).orElseThrow(MovieDoesNotExistException::new);
    }


}
