package com.revature.repositories;

import com.revature.models.Movies;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class MoviesRepositoryTest {

    @Autowired
    private MoviesRepository movieRepository;

    Movies inceptionMovie = new Movies();
    Movies interstellarMovie = new Movies();

    Movies interstellarMovie1 = new Movies();

    @BeforeEach
    void init() throws MalformedURLException {
        inceptionMovie = new Movies();
        inceptionMovie.setMovies_id(1);
        inceptionMovie.setTitle("inception");
        inceptionMovie.setGenre("scifi");
        inceptionMovie.setMoviePoster(new URL("https://m.media-amazon.com/images/M/MV5BMjAxMzY3NjcxNF5BMl5BanBnXkFtZTcwNTI5OTM0Mw@@._V1_FMjpg_UX1000_.jpg"));
        inceptionMovie.setTrailer(new URL("https://imdb-video.media-imdb.com/vi2959588889/1434659607842-pgv4ql-1596404706743.mp4?Expires=1678055530&Signature=ApeMmVgAZxuGx5EkQe~TNpEwVav-qZzEyzFxDKhSY4v3Wzu21zh9YWZA4F0LOTjtypZnEqGC~Z3NmfE88pY2SNOvb87z3k48lEMBlGzgILlmeKFD~HR4xqzfZ0s189OCZ0NrfrljhaZm2nb1ijgDbYO6vqie2CIGYuA1cOd2Fu9r7ZG5AUC97AudCzR8Iww6nWOP8ZrxlqDiQFYRQ~1YnG6G8-Fv-QvRj8O1QJnzPTZCQf06Sy-eZhgkWxbHWsWWS9ShCaqxsVJgd4W767UAU-zR1TuriJPH~21YF5Oo~FM~BxXiBmvaKpZOJQUdUxAvb-zPWDGEN8F0VB3N1KTVFA__&Key-Pair-Id=APKAIFLZBVQZ24NQH3KA"));
        inceptionMovie.setDescription("A thief who steals corporate secrets through the use of dream-sharing technology is given the inverse task of planting an idea into the mind of a C.E.O., but his tragic past may doom the project and his team to disaster.");
        inceptionMovie.setReleaseYear("2010");
        inceptionMovie.setPrice(9.99);

        interstellarMovie = new Movies();
        interstellarMovie.setMovies_id(2);
        interstellarMovie.setTitle("interstellar");
        interstellarMovie.setGenre("Adventure");
        interstellarMovie.setMoviePoster(new URL("https://m.media-amazon.com/images/M/MV5BZjdkOTU3MDktN2IxOS00OGEyLWFmMjktY2FiMmZkNWIyODZiXkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_.jpg"));
       interstellarMovie.setTrailer(new URL("https://imdb-video.media-imdb.com/vi1586278169/1434659607842-pgv4ql-1616202363366.mp4?Expires=1678055726&Signature=qdgKxMQnteT9we7neOr~AufBuPFDbHnE8OkYJ~MWd3lRjJMJShCUPBOxymyQMRnjrxsFfEd7Nl1v684pay7FeUvFfNtFJdJOm578oN-KK8P16wDh6F3VLk9K2gDnVLhGtqzE9H15SPdZB9HMOpV7--gd~7mnWGH94SwkJNmlqj6-45ZqxrNta1ZTJYxsqAAf6XxgBASbRU2bOEKBHI3ZW0fHNwzbSMQTipfk0RyhEhqOwdYj-P7LzBhdO0hV4Y0YY5tlYZ5ydE66p5~DNzczw1Y7eRGvY0wL5cQq98HMUBg-HC0jw5Ba8Lc8P6NqJgAtNswTtU4ClfhXALIMxr1ovA__&Key-Pair-Id=APKAIFLZBVQZ24NQH3KA"));
        interstellarMovie.setDescription("A team of explorers travel through a wormhole in space in an attempt to ensure humanity's survival.");
        interstellarMovie.setReleaseYear("2014");
        interstellarMovie.setPrice(14.99);

        interstellarMovie1 = new Movies();
        interstellarMovie1.setMovies_id(2);
        interstellarMovie1.setTitle("interstellar");
        interstellarMovie1.setGenre("Adventure");
        interstellarMovie1.setMoviePoster(new URL("https://m.media-amazon.com/images/M/MV5BZjdkOTU3MDktN2IxOS00OGEyLWFmMjktY2FiMmZkNWIyODZiXkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_.jpg"));
        interstellarMovie1.setTrailer(new URL("https://imdb-video.media-imdb.com/vi1586278169/1434659607842-pgv4ql-1616202363366.mp4?Expires=1678055726&Signature=qdgKxMQnteT9we7neOr~AufBuPFDbHnE8OkYJ~MWd3lRjJMJShCUPBOxymyQMRnjrxsFfEd7Nl1v684pay7FeUvFfNtFJdJOm578oN-KK8P16wDh6F3VLk9K2gDnVLhGtqzE9H15SPdZB9HMOpV7--gd~7mnWGH94SwkJNmlqj6-45ZqxrNta1ZTJYxsqAAf6XxgBASbRU2bOEKBHI3ZW0fHNwzbSMQTipfk0RyhEhqOwdYj-P7LzBhdO0hV4Y0YY5tlYZ5ydE66p5~DNzczw1Y7eRGvY0wL5cQq98HMUBg-HC0jw5Ba8Lc8P6NqJgAtNswTtU4ClfhXALIMxr1ovA__&Key-Pair-Id=APKAIFLZBVQZ24NQH3KA"));
        interstellarMovie1.setDescription("A team of explorers travel through a wormhole in space in an attempt to ensure humanity's survival.");
        interstellarMovie1.setReleaseYear("2014");
        interstellarMovie1.setPrice(14.99);
    }

    @Test
    @DisplayName("Movie should be saved in the database")
    void saveMovie (){
        Movies movie = movieRepository.save(inceptionMovie);
        assertNotNull(movie);
        assertThat(movie.getMovies_id()).isNotEqualTo(null);
    }

    @Test
    @DisplayName("Returns movie list size as 2")
    void getAllMovies (){
        movieRepository.save(inceptionMovie);
        movieRepository.save(interstellarMovie);

        List<Movies> movieList = movieRepository.findAll();
        Movies movie = movieRepository.save(inceptionMovie);
        assertNotNull(movieList);
        assertThat(movieList).isNotNull();
    }

    @Test
    @DisplayName("Fetches movie by id")
    void getMovieById() {
        movieRepository.save(inceptionMovie);

        Movies movie = movieRepository.findById(inceptionMovie.getMovies_id()).get();

        assertNotNull(movie);
        assertEquals("inception", movie.getTitle());
        assertEquals("scifi", movie.getGenre());
        assertEquals("2010", movie.getReleaseYear());
    }

    @Test
    @DisplayName("Returns adventure genre")
    void getMoviesByGenre() {

        movieRepository.save(interstellarMovie);

        Optional<List<Movies>> movie = movieRepository.findByGenre(interstellarMovie.getGenre());

        assertEquals("Adventure", interstellarMovie.getGenre());
    }



}
