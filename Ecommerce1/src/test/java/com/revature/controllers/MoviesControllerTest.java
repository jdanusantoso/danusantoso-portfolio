package com.revature.controllers;

import static org.hamcrest.CoreMatchers.is;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.models.Movies;
import com.revature.repositories.MoviesRepository;
import com.revature.service.MoviesService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import org.springframework.test.context.junit.jupiter.SpringExtension;

import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;


import java.util.ArrayList;
import java.util.List;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@ExtendWith(SpringExtension.class)
@WebMvcTest(MoviesController.class)
public class MoviesControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private MoviesRepository moviesRepository;

    @MockBean
    private MoviesService movieService;

    @Autowired
    private ObjectMapper objectMapper;

    private Movies inceptionMovie;
    private Movies interstellarMovie;


    @BeforeEach
    void init() {
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

    }

    @Test
    void getAllMovies() throws Exception {

        List<Movies> list = new ArrayList<>();
        list.add(inceptionMovie);
        list.add(interstellarMovie);

        when(movieService.getAllMovies()).thenReturn(list);

        this.mockMvc.perform(get("/movies/getAllMovies"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.size()", is(list.size())));
    }

    @Test
    void findByGenre() throws Exception {

        when(movieService.findMovieByGenre(anyString())).thenReturn(interstellarMovie);

        this.mockMvc.perform(get("/movies/findBy/{genre}", "adventure"))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.title", is(interstellarMovie.getTitle())))
                .andExpect(MockMvcResultMatchers.jsonPath("$.genre", is(interstellarMovie.getGenre())))
                .andExpect(MockMvcResultMatchers.jsonPath("$.releaseYear", is(interstellarMovie.getReleaseYear())))
                .andExpect(MockMvcResultMatchers.jsonPath("$.price", is(interstellarMovie.getPrice())));
    }

    @Test
    void GetByGenreAndTitle() throws Exception {

        when(movieService.getByGenreAndTitle(anyString(), anyString())).thenReturn(interstellarMovie);

        this.mockMvc.perform(get("/movies/{genre}/{title}", "adventure", "interstellar"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.movies_id", is(interstellarMovie.getMovies_id())))
                .andExpect(jsonPath("$.title", is(interstellarMovie.getTitle())))
                .andExpect(jsonPath("$.genre", is(interstellarMovie.getGenre())))
                .andExpect(jsonPath("$.releaseYear", is(interstellarMovie.getReleaseYear())));
    }




}