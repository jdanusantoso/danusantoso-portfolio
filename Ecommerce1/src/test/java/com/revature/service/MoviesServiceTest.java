package com.revature.service;

import com.revature.models.Movies;
import com.revature.repositories.MoviesRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


import java.util.ArrayList;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class MoviesServiceTest {

    @Mock
    private MoviesRepository moviesRepository;

    @InjectMocks
    private MoviesService movieService;

    private Movies movieGenre;
    private Movies inceptionMovie;
    private Movies interstellarMovie;
    private Movies tenetMovie;

    @BeforeEach
    void init() {

        movieGenre = new Movies();
        movieGenre.setGenre("action");

        inceptionMovie = new Movies();
        inceptionMovie.setMovies_id(1);
        inceptionMovie.setTitle("inception");
        inceptionMovie.setGenre("scifi");
        inceptionMovie.setReleaseYear("2010");

        interstellarMovie = new Movies();
        interstellarMovie.setMovies_id(2);
        interstellarMovie.setTitle("interstellar");
        interstellarMovie.setGenre("Adventure");
        interstellarMovie.setReleaseYear("2010");

        tenetMovie = new Movies();
        tenetMovie.setGenre("action");

    }

    @Test
    void saveTest() {

        when(moviesRepository.save(any(Movies.class))).thenReturn(inceptionMovie);

        Movies newMovie = movieService.save(inceptionMovie);

        assertNotNull(newMovie);
        assertThat(newMovie.getTitle()).isEqualTo("inception");
    }

    @Test
    void getMoviesTest() {

        List<Movies> list = new ArrayList<>();
        list.add(inceptionMovie);
        list.add(interstellarMovie);

        when(moviesRepository.findAll()).thenReturn(list);

        List<Movies> movies = movieService.getAllMovies();

        assertEquals(2, movies.size());
        assertNotNull(movies);
    }

    @Test
    void getByGenreTest() {

        List<Movies> list = new ArrayList<>();
        list.add(tenetMovie);

        when(moviesRepository.findByGenre("action")).thenReturn(Optional.of(list));

        List<Movies> movies = movieService.findByGenre("action");

        assertEquals(1, movies.size());
        assertNotNull(movies);
;
    }

    @Test
    void getMovieByGenreTest() {
        when(moviesRepository.findMovieByGenre("scifi")).thenReturn(Optional.of(inceptionMovie));
        Movies existingMovie = movieService.findMovieByGenre(inceptionMovie.getGenre());
        assertNotNull(existingMovie);
        assertThat(existingMovie.getGenre()).isNotEqualTo(null);
    }

    @Test
    void getMovieByGenreForExceptionTest() {

        when(moviesRepository.findMovieByGenre("adventure")).thenReturn(Optional.of(inceptionMovie));
        assertThrows(RuntimeException.class, () -> {
            movieService.findMovieByGenre(inceptionMovie.getGenre());
        });
    }
    @Test
    void getByGenreAndTitleTest() {
        when(moviesRepository.getByGenreAndTitle("scifi", "inception")).thenReturn(Optional.of(inceptionMovie));
        Movies existingMovie = movieService.getByGenreAndTitle(inceptionMovie.getGenre(), inceptionMovie.getTitle());
        assertNotNull(existingMovie);
        assertThat(existingMovie).isNotEqualTo(null);
    }

    @Test
    void getByGenreAndTitleForExceptionGenreTest() {
        when(moviesRepository.getByGenreAndTitle("adventure", "inception")).thenReturn(Optional.of(inceptionMovie));
        assertThrows(RuntimeException.class, () -> {
            movieService.getByGenreAndTitle(inceptionMovie.getGenre(), inceptionMovie.getTitle());
        });
    }

    @Test
    void getByGenreAndTitleForExceptionTitleTest() {
        when(moviesRepository.getByGenreAndTitle("scifi", "interstellar")).thenReturn(Optional.of(inceptionMovie));
        assertThrows(RuntimeException.class, () -> {
            movieService.getByGenreAndTitle(inceptionMovie.getGenre(), inceptionMovie.getTitle());
        });
    }

    @Test
    void getByGenreAndTitleForExceptionGenreTitleTest() {
        when(moviesRepository.getByGenreAndTitle("adventure", "interstellar")).thenReturn(Optional.of(inceptionMovie));
        assertThrows(RuntimeException.class, () -> {
            movieService.getByGenreAndTitle(inceptionMovie.getGenre(), inceptionMovie.getTitle());
        });
    }




}
