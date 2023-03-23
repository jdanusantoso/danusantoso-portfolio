package com.revature.controllers;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.models.PaymentInformation;

import com.revature.repositories.PaymentInformationRepository;

import com.revature.service.PaymentInformationService;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;



import static org.hamcrest.CoreMatchers.is;
import static org.mockito.ArgumentMatchers.any;

import static org.mockito.Mockito.when;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@WebMvcTest(PaymentInformationController.class)
public class PaymentInformationControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private PaymentInformationRepository paymentInformationRepository;

    @MockBean
    private PaymentInformationService paymentInformationService;

    @Autowired
    private ObjectMapper objectMapper;

    PaymentInformation upi1;
    PaymentInformation upi2;


    @BeforeEach
    void setUp() throws Exception {

        upi1 = new PaymentInformation();
        upi1.setCard_number("4017957420151");
        upi1.setExpiration_date_month("06");
        upi1.setExpiration_date_year("25");
        upi1.setCvvNumber("878");

        upi2 = new PaymentInformation();
        upi2.setCard_number("4582785084125388");
        upi2.setExpiration_date_month(null);
        upi2.setExpiration_date_year("25");
        upi2.setCvvNumber("542");

    }
    //HTTP Requests-------------------------------

        @Test
        void shouldCreateNewPaymentInfo() throws Exception {

            when(paymentInformationService.save(any(PaymentInformation.class))).thenReturn(upi1);


            this.mockMvc.perform(post("/payment/info/new")
                            .contentType(MediaType.APPLICATION_JSON)
                            .content(objectMapper.writeValueAsString(upi1)))
                    .andExpect(status().isCreated())
                    .andExpect(jsonPath("$.creditInfo_id", is(upi1.getCreditInfo_id())))
                    .andExpect(jsonPath("$.card_number", is(upi1.getCard_number())))
                    .andExpect(jsonPath("$.expiration_date_month", is(upi1.getExpiration_date_month())))
                    .andExpect(jsonPath("$.expiration_date_year", is(upi1.getExpiration_date_year())))
                    .andExpect(jsonPath("$.cvvNumber", is(upi1.getCvvNumber())));



        }



}
