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

        if(AuthController.ses != null){

            List<Ticket> tickets = tDao.viewAllSubmittedTickets();

            Gson gson = new Gson();

            String JSONTickets = gson.toJson(tickets);

            ctx.result(JSONTickets);

            ctx.status(202);

        }else{
            ctx.result("You must be logged in order to perform this action.");
            ctx.status(401);
        }
    };

    public Handler createNewTicket = (ctx) -> {

        if(AuthController.ses != null){
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
        }else{
            ctx.result("You must be logged in order to perform this action.");
            ctx.status(401);
        }
    };

    public Handler viewAllEmployeeSubmittedTicketsHandler = (ctx) -> {

        if(AuthController.ses != null){
            List<Ticket> tickets = tDao.viewAllEmployeeSubmittedTickets("Joey Santos");

            Gson gson = new Gson();

            String JSONTickets = gson.toJson(tickets);

            ctx.result(JSONTickets);
        }else{
            ctx.result("You must be logged in order to perform this action.");
            ctx.status(401);
        }
    };

    public Handler updateTicketStatusHandler = (ctx) -> {

        if(AuthController.ses != null){

            int ticket_id = Integer.parseInt(ctx.pathParam("id"));

            String ticket_status = ctx.body();

            if (tDao.updateTicketStatus(ticket_status, ticket_id)) {
                ctx.status(202);
            } else {
                ctx.status(406);
            }

        }else{
            ctx.result("You must be logged in order to perform this action.");
            ctx.status(401);
        }
    };

    public Handler viewAllPendingTicketsHandler = (ctx) -> {

        if(AuthController.ses != null){

            //String ticket_status = "Pending";

            List<Ticket> tickets = tDao.viewAllPendingTickets("Pending");

            Gson gson = new Gson();

            String JSONTickets = gson.toJson(tickets);

            ctx.result(JSONTickets);

        }else{
            ctx.result("You must be logged in order to perform this action.");
            ctx.status(401);
        }
    };

}


