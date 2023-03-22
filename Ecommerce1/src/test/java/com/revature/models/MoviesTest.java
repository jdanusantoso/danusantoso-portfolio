package com.revature.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class MoviesTest {

    private Movies movies;

    @BeforeEach
    void setUp() throws MalformedURLException {


        //Clean up the code
                movies = Movies.builder().title("The Lord of the Rings: The Fellowship of the Ring")
                        .genre("adventure")
                        .moviePoster(new URL("https://m.media-amazon.com/images/M/MV5BN2EyZjM3NzUtNWUzMi00MTgxLWI0NTctMzY4M2VlOTdjZWRiXkEyXkFqcGdeQXVyNDUzOTQ5MjY@._V1_FMjpg_UX1000_.jpg"))
                        .trailer(new URL("https://imdb-video.media-imdb.com/vi684573465/1434659607842-pgv4ql-1640006590845.mp4?Expires=1678053392&Signature=NEUWe2wMD62uUwIafzc5QXyiXvYItJ0D5a5g9NsOMdRQ7nqEkuVQg-VE-NF45Ty1I2oW4NMJIutLUNtmko4ykOkzg-dzIbMzkjxhC-M0a6HgU~tnjfjqaJjWeZ6ZgZmWd9~IRsVSZP0~cAp-cJEzlgjPQoTfYl44XcemsJFGTAgDPaIvnjfS36aBO1vxrOeBflJLETiMMBAuqzjCy6JZBOl4Eqt-9xnegFDyWudKp6bbB6c~2XevC8oqRNnDAe-c3jH67rivEEn3rSN9CWa8at~HBs0BHIs~YwqrHAzDVwX5vlGeqP9HEPjqeCAmcV~ApJvBuu6ggCOES0~aCvUJNA__&Key-Pair-Id=APKAIFLZBVQZ24NQH3KA"))
                        .description("A meek Hobbit from the Shire and eight companions set out on a journey to destroy the powerful One Ring and save Middle-earth from the Dark Lord Sauron.")
                        .releaseYear("2001")
                        .price(14.99)
                        .movies_id(1)
                        .build();

    }

    @Test
    void getId() {
        assertNotNull(movies);
        assertEquals(1, movies.getMovies_id());
    }

    @Test
    void setId() {
        assertNotNull(movies);
        movies.setMovies_id(2);
        assertEquals(2, movies.getMovies_id());
    }

    @Test
    void setTitle() {
        assertNotNull(movies);
        movies.setTitle("The Fellowship of the Ring");
        assertEquals("The Fellowship of the Ring", movies.getTitle());
    }
    @Test
    void getTitle() {
        assertNotNull(movies);
        assertEquals("The Lord of the Rings: The Fellowship of the Ring", movies.getTitle());
    }

    @Test
    void setGenre() {
        assertNotNull(movies);
        movies.setTitle("adventure");
        assertEquals("adventure", movies.getGenre());
    }
    @Test
    void getGenre() {
        assertNotNull(movies);
        assertEquals("adventure", movies.getGenre());
    }

    @Test
    void getMoviePoster() {
        assertNotNull(movies);
        assertEquals("https://m.media-amazon.com/images/M/MV5BN2EyZjM3NzUtNWUzMi00MTgxLWI0NTctMzY4M2VlOTdjZWRiXkEyXkFqcGdeQXVyNDUzOTQ5MjY@._V1_FMjpg_UX1000_.jpg", movies.getMoviePoster().toString());
    }

    @Test
    void setMoviePoster() throws MalformedURLException {
        assertNotNull(movies);
        movies.setMoviePoster(new URL("https://www.imdb.com/title/tt0120737/mediaviewer/rm3592958976/?ref_=tt_ov_i"));
        assertEquals("https://www.imdb.com/title/tt0120737/mediaviewer/rm3592958976/?ref_=tt_ov_i", movies.getMoviePoster().toString());
    }

    @Test
    void getTrailer() {
        assertNotNull(movies);
        assertEquals("https://imdb-video.media-imdb.com/vi684573465/1434659607842-pgv4ql-1640006590845.mp4?Expires=1678053392&Signature=NEUWe2wMD62uUwIafzc5QXyiXvYItJ0D5a5g9NsOMdRQ7nqEkuVQg-VE-NF45Ty1I2oW4NMJIutLUNtmko4ykOkzg-dzIbMzkjxhC-M0a6HgU~tnjfjqaJjWeZ6ZgZmWd9~IRsVSZP0~cAp-cJEzlgjPQoTfYl44XcemsJFGTAgDPaIvnjfS36aBO1vxrOeBflJLETiMMBAuqzjCy6JZBOl4Eqt-9xnegFDyWudKp6bbB6c~2XevC8oqRNnDAe-c3jH67rivEEn3rSN9CWa8at~HBs0BHIs~YwqrHAzDVwX5vlGeqP9HEPjqeCAmcV~ApJvBuu6ggCOES0~aCvUJNA__&Key-Pair-Id=APKAIFLZBVQZ24NQH3KA", movies.getTrailer().toString());
    }

    @Test
    void setTrailer() throws MalformedURLException {
        assertNotNull(movies);
        movies.setMoviePoster(new URL("https://m.media-amazon.com/images/I/71TZ8BmoZqL.jpg"));
        assertEquals("https://imdb-video.media-imdb.com/vi684573465/1434659607842-pgv4ql-1640006590845.mp4?Expires=1678053392&Signature=NEUWe2wMD62uUwIafzc5QXyiXvYItJ0D5a5g9NsOMdRQ7nqEkuVQg-VE-NF45Ty1I2oW4NMJIutLUNtmko4ykOkzg-dzIbMzkjxhC-M0a6HgU~tnjfjqaJjWeZ6ZgZmWd9~IRsVSZP0~cAp-cJEzlgjPQoTfYl44XcemsJFGTAgDPaIvnjfS36aBO1vxrOeBflJLETiMMBAuqzjCy6JZBOl4Eqt-9xnegFDyWudKp6bbB6c~2XevC8oqRNnDAe-c3jH67rivEEn3rSN9CWa8at~HBs0BHIs~YwqrHAzDVwX5vlGeqP9HEPjqeCAmcV~ApJvBuu6ggCOES0~aCvUJNA__&Key-Pair-Id=APKAIFLZBVQZ24NQH3KA", movies.getTrailer().toString());
    }

    @Test
    void setDescription() {
        assertNotNull(movies);
        movies.setDescription("A meek Hobbit from the Shire and eight companions set out on a journey to destroy the powerful One Ring and save Middle-earth from the Dark Lord Sauron.");
        assertEquals("A meek Hobbit from the Shire and eight companions set out on a journey to destroy the powerful One Ring and save Middle-earth from the Dark Lord Sauron.", movies.getDescription());
    }
    @Test
    void getDescription() {
        assertNotNull(movies);
        assertEquals("A meek Hobbit from the Shire and eight companions set out on a journey to destroy the powerful One Ring and save Middle-earth from the Dark Lord Sauron.", movies.getDescription());
    }


    @Test
    void setReleaseYear() {
        assertNotNull(movies);
        movies.setReleaseYear("2001");
        assertEquals("2001", movies.getReleaseYear());
    }
    @Test
    void getReleaseYear() {
        assertNotNull(movies);
        assertEquals("2001", movies.getReleaseYear());
    }

    @Test
    void setPrice() {
        assertNotNull(movies);
        movies.setPrice(14.99);
        assertEquals(14.99, movies.getPrice());
    }
    @Test
    void getPrice() {
        assertNotNull(movies);
        assertEquals(14.99, movies.getPrice());
    }



}