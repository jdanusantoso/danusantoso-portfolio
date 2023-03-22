package com.revature.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.net.URL;

@Entity
@Table(name="movies")
@Component

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Movies {

    @Id //This will make this field the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //This makes our PK serial
    private int movies_id;
    @Column (nullable = false)
    private String title;

    @Column(nullable = false)
    @Lob
    private URL moviePoster;

    @Column(nullable = false)
    @Lob
    private URL trailer;

    @Column (nullable = false)
    private String genre;

    @Column (nullable = false)
    @Lob
    private String description;

    @Column(nullable = false)
    private String releaseYear;

    @Column(nullable = false, precision=10, scale=2)
    private double price;

    //FK relationship that shows many accounts to 1 user
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "ordersId")

    private Orders orders;


    //Other Purposes


    public Movies(String title, URL moviePoster, URL trailer, String genre, String description, String releaseYear, double price) {
        this.title = title;
        this.moviePoster = moviePoster;
        this.trailer = trailer;
        this.genre = genre;
        this.description = description;
        this.releaseYear = releaseYear;
        this.price = price;
    }

    public Movies(int movies_id, String title, String genre, String description, String releaseYear, double price, Orders orders) {
        this.movies_id = movies_id;
        this.title = title;
        this.genre = genre;
        this.description = description;
        this.releaseYear = releaseYear;
        this.price = price;
        this.orders = orders;
    }

    public Movies(String title, String genre, String releaseYear, double price) {
        this.title = title;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.price = price;
    }

    public Movies(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }

    public Movies(String genre) {
        this.genre = genre;
    }

}