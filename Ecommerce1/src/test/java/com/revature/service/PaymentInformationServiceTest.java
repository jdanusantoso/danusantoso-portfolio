package com.revature.service;

import com.revature.models.PaymentInformation;
import com.revature.repositories.PaymentInformationRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class PaymentInformationServiceTest {

    @Mock
    private PaymentInformationRepository paymentInformationRepository;

    @InjectMocks
    private PaymentInformationService paymentInformationService;

    PaymentInformation upi1;
    PaymentInformation upi2;

    @BeforeEach
    void init() {
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

    @Test
    void save() {

        when(paymentInformationRepository.save(any(PaymentInformation.class))).thenReturn(upi1);

        PaymentInformation newPaymentInfo = paymentInformationService.save(upi1);

        assertNotNull(newPaymentInfo);
        assertThat(upi1.getCard_number()).isEqualTo("4017957420151");
        assertThat(upi1.getExpiration_date_month()).isEqualTo("06");
        assertThat(upi1.getExpiration_date_year()).isEqualTo("25");
        assertThat(upi1.getCvvNumber()).isEqualTo("878");

    }


}
