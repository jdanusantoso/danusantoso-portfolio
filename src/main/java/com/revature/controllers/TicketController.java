package com.revature.controllers;

import com.google.gson.Gson;
import com.revature.dao.TicketDaoJDBC;
import com.revature.models.Employee;
import com.revature.models.Ticket;
import io.javalin.http.Handler;

import java.util.List;

public class TicketController {

    TicketDaoJDBC tDao = new TicketDaoJDBC();

    public Handler getTicketHandlerSubmitted = (ctx) -> {


        List<Ticket> tickets = tDao.viewAllSubmittedTickets();

        Gson gson = new Gson();

        String JSONTickets = gson.toJson(tickets);

        ctx.result(JSONTickets);

    };

    public Handler createNewTicket = (ctx) -> {

        String body = ctx.body();

        Gson gson = new Gson();

        Ticket newT = gson.fromJson(body, Ticket.class);

        if (tDao.createNewTicket(newT) != null) {
            ctx.status(201);
            ctx.result(body); //Send back the employee
        } else {
            ctx.status(406);
            ctx.result("Expense ticket reimbursement submission failed.");
        }

    };

    public Handler viewAllEmployeeSubmittedTicketsHandler = (ctx) -> {

        List<Ticket> tickets = tDao.viewAllEmployeeSubmittedTickets("Joey Santos");

        Gson gson = new Gson();

        String JSONTickets = gson.toJson(tickets);

        ctx.result(JSONTickets);


    };

    public Handler updateTicketStatusHandler = (ctx) -> {

        int ticket_id = Integer.parseInt(ctx.pathParam("id"));

        String ticket_status = ctx.body();

        if (tDao.updateTicketStatus(ticket_status, ticket_id)) {
            ctx.status(202);
        } else {
            ctx.status(406);
        }


    };

    public Handler viewAllPendingTicketsHandler = (ctx) -> {

        //String ticket_status = "Pending";

        List<Ticket> tickets = tDao.viewAllPendingTickets("Pending");

        Gson gson = new Gson();

        String JSONTickets = gson.toJson(tickets);

        ctx.result(JSONTickets);


    };

}


