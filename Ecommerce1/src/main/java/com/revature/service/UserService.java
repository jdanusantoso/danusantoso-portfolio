package com.revature.service;


import com.revature.repositories.UserRepository;
import com.revature.exceptions.InvalidCredentialsException;
import com.revature.models.Users;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;


import java.util.List;


@Service
//With @Transactional, each method inside of this class will be treated as a single transaction
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepo;

    public Users save(Users user) {
        return userRepo.save(user);
    }

    public Users registerUser(Users u) {

       return  userRepo.save(u);

//        return userRepo.getByUsername(u.getUsername());
    }

    public Users getByUsernameAndPassword(String username, String password) {
        Users u = userRepo.getByUsernameAndPassword(username, password).orElseThrow(InvalidCredentialsException::new);

        if(u.getUsername().equals(username) || u.getPassword().equals(password)) {
            return u;
        }

        throw new InvalidCredentialsException();

    }

    public Users getByEmailAndPassword(String email, String password) {
        Users u = userRepo.getByEmailAndPassword(email, password).orElseThrow(InvalidCredentialsException::new);

        if(u.getEmail().equals(email) || u.getPassword().equals(password)) {
            return u;
        }

        throw new InvalidCredentialsException();

    }


    public List<Users> getAllUsers() {
        return userRepo.findAll();
    }


}