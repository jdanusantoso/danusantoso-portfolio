package com.revature.repositories;

import com.revature.models.PaymentInformation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class PaymentInfoRepositoryTest  {

    @Autowired
    private PaymentInformationRepository paymentInformationRepository;

    private PaymentInformation userPaymentInfo;

    @BeforeEach
    void init() {

        userPaymentInfo = new PaymentInformation();
        userPaymentInfo.setCreditInfo_id(1);
        userPaymentInfo.setCard_number("4388039563858");
        userPaymentInfo.setExpiration_date_month("05");
        userPaymentInfo.setExpiration_date_year("24");
        userPaymentInfo.setCvvNumber("433");

    }

    @Test
    @DisplayName("Payment information should be saved in the database")
    void save (){
        PaymentInformation p = paymentInformationRepository.save(userPaymentInfo);
        assertNotNull(p);
        assertThat(p.getCreditInfo_id()).isNotEqualTo(null);
        assertThat(p.getCreditInfo_id()).isEqualTo(1);
        assertThat(p.getCard_number()).isEqualTo("4388039563858");
        assertThat(p.getExpiration_date_month()).isEqualTo("05");
        assertThat(p.getExpiration_date_year()).isEqualTo("24");
        assertThat(p.getCvvNumber()).isEqualTo("433");
    }

}
