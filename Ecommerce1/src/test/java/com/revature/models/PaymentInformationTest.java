package com.revature.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PaymentInformationTest {

    private PaymentInformation paymentInfo;

    @BeforeEach
    void setUp() {

        //Clean Up Code

        paymentInfo = PaymentInformation.builder().creditInfo_id(1)
                .card_number("4388039563858")
                .expiration_date_month("05")
                .expiration_date_year("24")
                .cvvNumber("433")
                .build();


    }

    @Test
    void getCreditInfo_id() {
        assertNotNull(paymentInfo);
        assertEquals(1, paymentInfo.getCreditInfo_id());
    }

    @Test
    void setCreditInfo_id() {
        assertNotNull(paymentInfo);
        paymentInfo.setCreditInfo_id(2);
        assertEquals(2, paymentInfo.getCreditInfo_id());
    }

    @Test
    void getCardNumber() {
        assertNotNull(paymentInfo);
        assertEquals("4388039563858", paymentInfo.getCard_number());
    }

    @Test
    void setCardNumber() {
        assertNotNull(paymentInfo);
        paymentInfo.setCard_number("4388039563858");
        assertEquals("4388039563858", paymentInfo.getCard_number());
    }

    @Test
    void getExpirationDateMonth() {
        assertNotNull(paymentInfo);
        assertEquals("05", paymentInfo.getExpiration_date_month());
    }

    @Test
    void setExpirationDateMonth() {
        assertNotNull(paymentInfo);
        paymentInfo.setExpiration_date_month("05");
        assertEquals("05", paymentInfo.getExpiration_date_month());
    }

    @Test
    void getExpirationDateYear() {
        assertNotNull(paymentInfo);
        assertEquals("24", paymentInfo.getExpiration_date_year());
    }

    @Test
    void setExpirationDateYear() {
        assertNotNull(paymentInfo);
        paymentInfo.setExpiration_date_year("24");
        assertEquals("24", paymentInfo.getExpiration_date_year());
    }

    @Test
    void getCvvNumber() {
        assertNotNull(paymentInfo);
        assertEquals("433", paymentInfo.getCvvNumber());
    }

    @Test
    void setCvvNumber() {
        assertNotNull(paymentInfo);
        paymentInfo.setCvvNumber("433");
        assertEquals("433", paymentInfo.getCvvNumber());
    }

}
