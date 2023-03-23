package com.example.models.exceptions;

public class InvalidReleaseYearException extends Exception {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public InvalidReleaseYearException() {

        super("Invalid year. Please enter a year after 2012.");

    }


}