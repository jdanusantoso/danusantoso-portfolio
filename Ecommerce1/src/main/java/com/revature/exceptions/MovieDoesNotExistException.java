package com.revature.exceptions;

public class MovieDoesNotExistException extends RuntimeException {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public MovieDoesNotExistException() {
        super("The movie you are searching for does not exist.");
    }

}