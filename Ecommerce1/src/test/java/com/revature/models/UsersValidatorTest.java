package com.revature.models;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;

@SpringBootTest
public class UsersValidatorTest {
    @Autowired
    private Validator validator;

    private Users user1;
    private Users user2;

    @Before
    public void init() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }

    @Test
    void testEmailPasswordFailure() {
        Users user1 = new Users();
        user1.setUser_id(1);
        user1.setFirst_name("Adara");
        user1.setLast_name("Truesdale");
        user1.setEmail("atruesdale2exblog.jp");
        user1.setUsername("atruesdale2");
        user1.setPassword("cITMUn");
        Set<ConstraintViolation<Users>> violations = validator.validate(user1);
        assertFalse(violations.isEmpty());
        assertThat(violations.size()).isEqualTo(2);
    }

    @Test
    void testPasswordLengthFailure() {
        Users user1 = new Users();
        user1.setUser_id(1);
        user1.setFirst_name("Adara");
        user1.setLast_name("Truesdale");
        user1.setEmail("atruesdale2@exblog.jp");
        user1.setUsername("a");
        user1.setPassword("cITMUn58");
        Set<ConstraintViolation<Users>> violations = validator.validate(user1);
        assertFalse(violations.isEmpty());
        assertThat(violations.size()).isEqualTo(1);
    }

    @Test
    void testNullFailure() {
        Users user1 = new Users();
        user1.setUser_id(1);
        user1.setFirst_name("Adara");
        user1.setLast_name("Truesdale");
        user1.setEmail("null");
        user1.setUsername("null");
        user1.setPassword("null");
        Set<ConstraintViolation<Users>> violations = validator.validate(user1);
        assertFalse(violations.isEmpty());
        assertThat(violations.size()).isEqualTo(3);
    }



}
