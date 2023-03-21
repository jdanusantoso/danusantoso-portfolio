package com.revature.models;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.ValidatorFactory;
import javax.validation.Validator;

import java.util.Set;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class PaymentInformationValidatorTest {
    @Autowired
    private Validator validator;

    private PaymentInformation paymentInfo;
    private PaymentInformation paymentInfo1;

    @Before
    public void init() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }

    @Test
    void testCSVFailure() {
        PaymentInformation paymentInfo1 = new PaymentInformation();
        paymentInfo1.setCard_number("4041371595863166");
        paymentInfo1.setExpiration_date_month("07");
        paymentInfo1.setExpiration_date_year("25");
        paymentInfo1.setCvvNumber("63");
        Set<ConstraintViolation<PaymentInformation>> violations = validator.validate(paymentInfo1);
        assertFalse(violations.isEmpty());
    }

    @Test
    void testCardNumberLengthFailure() {
        PaymentInformation paymentInfo1 = new PaymentInformation();
        paymentInfo1.setCard_number("404137");
        paymentInfo1.setExpiration_date_month("07");
        paymentInfo1.setExpiration_date_year("25");
        paymentInfo1.setCvvNumber("063");
        Set<ConstraintViolation<PaymentInformation>> violations = validator.validate(paymentInfo1);
        assertFalse(violations.isEmpty());
    }

    @Test
    void testCardNumberExpirationDateFailure() {
        PaymentInformation paymentInfo1 = new PaymentInformation();
        paymentInfo1.setCard_number("404137");
        paymentInfo1.setExpiration_date_month("17");
        paymentInfo1.setExpiration_date_year("49");
        paymentInfo1.setCvvNumber("063");
        Set<ConstraintViolation<PaymentInformation>> violations = validator.validate(paymentInfo1);
        assertFalse(violations.isEmpty());
        assertThat(violations.size()).isEqualTo(3);

    }

    @Test
    void testNullFailure() {
        PaymentInformation paymentInfo1 = new PaymentInformation();
        paymentInfo1.setCard_number("null");
        paymentInfo1.setExpiration_date_month("null");
        paymentInfo1.setExpiration_date_year("25");
        paymentInfo1.setCvvNumber("63");
        Set<ConstraintViolation<PaymentInformation>> violations = validator.validate(paymentInfo1);
        assertFalse(violations.isEmpty());
        assertThat(violations.size()).isEqualTo(5);
    }



}
