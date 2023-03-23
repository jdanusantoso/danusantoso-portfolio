package com.revature.controllers;


import com.revature.repositories.UserRepository;
import com.revature.exceptions.InvalidCredentialsException;
import com.revature.models.Users;
import com.revature.service.UserService;
import lombok.AllArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController //This combines @Controller and @ResponseBody
@CrossOrigin //lets us take in HTTP requests (might have to specify ports in your P2)
@RequestMapping(value="/users")
@AllArgsConstructor
public class UserController {

    private UserService userService;
    private UserRepository userRepository;




    //HTTP Requests-------------------------------


    @PostMapping(value = "/registerUser")
    //url : localhost:5556/data/registerUser
    @ResponseStatus(HttpStatus.CREATED)
    public Users registerUser(@RequestBody @Valid Users u) {

        return userService.save(u);
    }

    @GetMapping("/login/{username}/{password}")
    //url: localhost:5556/data/users/login/username/password
    @ResponseStatus(HttpStatus.OK)
    public Users loginUser( @PathVariable String username, @PathVariable String password) {
        return userService.getByUsernameAndPassword(username, password);
    }


    //If the user signs in with incorrect credentials, it will result in an exception, lets handle that exception
    @ExceptionHandler({InvalidCredentialsException.class})
    public ResponseEntity<String> handleIncorrectCredentials(){
        return new ResponseEntity<String>("Invalid email or password. Please try again.", HttpStatus.FORBIDDEN);
    }

    @GetMapping("/login/email/{email}/{password}")
//    @GetMapping("/login/email/{email}/{password}")
    //url: localhost:5556/data/users/login/email/password
    @ResponseStatus(HttpStatus.OK)
    public Users loginByEmailAndPassword( @PathVariable String email, @PathVariable String password) {
        return userService.getByEmailAndPassword(email, password);
    }

    @GetMapping (value="/getAllUsers")
    //url: localhost:5556/data/users/getAllUsers
    public ResponseEntity<List<Users>> getAllAccounts(){

        return ResponseEntity.ok(userService.getAllUsers()); //.ok() returns a 200 level status code

    }

}
