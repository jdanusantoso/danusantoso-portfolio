package com.example.models.implementation;

import com.example.models.model.Movies;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class MovieGenres {

    public abstract void viewAllMovies(ArrayList<Movies> moviesArray);

    public abstract void filterMoviesByGenre(Movies movie, ArrayList<Movies> moviesArray);

    public abstract void searchDatabase(Movies movie, ArrayList<Movies> moviesArray);

    public abstract void searchDatabaseByTitleGenre(Movies movie, ArrayList<Movies> moviesArray);

    public abstract void searchDatabaseByTitle(Movies movie, ArrayList<Movies> moviesArray);

    public abstract void addMovieToDatabase(Movies movie, ArrayList<Movies> moviesArray);

    public abstract void removeMovieFromDatabase(Movies movie, ArrayList<Movies> moviesArray);


}