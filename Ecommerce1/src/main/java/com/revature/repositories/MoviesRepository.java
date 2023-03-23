package com.revature.repositories;

import com.revature.models.Movies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Repository
public interface MoviesRepository extends JpaRepository<Movies, Integer> {

    //This is our entire DAO for now... showing custom DAO method below

    @Transactional
    Optional<List<Movies>> findByGenre (String genre);

    Optional<Movies> findMovieByGenre (String genre);


    public Optional<Movies>getByGenreAndTitle(String genre, String title);


}
