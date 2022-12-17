package com.revature.exception;

@SuppressWarnings("serial")

public class MissingRequiredTicketInformation extends Exception {

    public MissingRequiredTicketInformation() {

        super("You are submitting a ticket that does not have the required ticket submitter name, \n"
                + "expense description, and/or expense amount.");
    }

}

