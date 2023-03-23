package com.revature.controllers;


import com.revature.exceptions.InvalidCredentialsException;
import com.revature.models.PaymentInformation;
import com.revature.models.Users;
import com.revature.repositories.PaymentInformationRepository;
import com.revature.repositories.UserRepository;
import com.revature.service.PaymentInformationService;
import com.revature.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController //This combines @Controller and @ResponseBody
@CrossOrigin //lets us take in HTTP requests (might have to specify ports in your P2)
@RequestMapping(value="/payment")
@AllArgsConstructor
public class PaymentInformationController {

    private PaymentInformationService paymentInformationService;

    //HTTP Requests-------------------------------


    @PostMapping(value = "/info/new")
    //url : localhost:5556/data/registerUser
    @ResponseStatus(HttpStatus.CREATED)
    public PaymentInformation createPaymentInfo(@Valid @RequestBody PaymentInformation p) {
        return paymentInformationService.save(p);
    }


}
