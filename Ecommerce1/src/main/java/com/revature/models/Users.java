package com.revature.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name="users", schema = "ecommerce")
@Component

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Users {

    @Id //This will make this field the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //This makes our PK serial
    private int user_id;


    @Column //now this column has a not null constraint
    private String first_name;

    @Column //now this column has a not null constraint
    private String last_name;

    @Column(nullable = false)
    @Email
    @NotEmpty(message = "Field cannot be empty")
    private String email;
    @Column(nullable = false, unique = true)
    @NotEmpty(message = "Field cannot be empty")
    @Size(min = 6, max = 30, message = "Length of input must between 6 and 30")
    private String username;

    @Column(nullable = false, unique = true)
    @NotEmpty(message = "Field cannot be empty")
    @Size(min = 8, max = 14, message = "Length of input must between 8 adn 14")
    private String password;


    //Login
    public Users(String email, String username, String password) {
        this.email = email;
        this.username = username;
        this.password = password;
    }


    public Users(String username, String password) {
        this.username = username;
        this.password = password;
    }


}
