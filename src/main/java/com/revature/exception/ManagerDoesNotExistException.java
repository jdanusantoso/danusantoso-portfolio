package com.revature.exception;

public class ManagerDoesNotExistException extends Throwable {

    public ManagerDoesNotExistException() {

        super("The manager that is trying to login does not have an existing username.");
    }

}
