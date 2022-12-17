package com.revature.exception;

public class UnauthorizedResponseException extends Exception {

    public UnauthorizedResponseException() {

        super("You are trying to input a response that is outside the parameters.");
    }

}