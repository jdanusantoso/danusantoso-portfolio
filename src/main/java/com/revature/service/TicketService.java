package com.revature.service;

import java.util.List;

import com.revature.exception.CannotUpdateException;
import com.revature.exception.MissingRequiredTicketInformation;
import com.revature.exception.TicketDoesNotExistException;
import com.revature.dao.TicketDao;
import com.revature.models.Ticket;

public class TicketService {

    private TicketDao ticketDao;

    public TicketService(TicketDao ticketDao) {
        this.ticketDao = ticketDao;
    }

    public Ticket createNewTicket(String ticket_name, int expense_date, String expense_description, Double expense_amount, String ticket_submitter, int
            expense_Type_fk, String ticket_status) throws MissingRequiredTicketInformation {


        if (expense_description.isEmpty() || ticket_submitter.isEmpty() || expense_amount <= 0) {
            throw new MissingRequiredTicketInformation();

        } else {
            System.out.println("The ticket does have a valid ticket submitter name, \n" +
                    "expense amount, and expense description. You can submit the ticket.");
        }


        Ticket t = new Ticket(ticket_name, expense_date, expense_description,
                expense_amount, ticket_submitter, expense_Type_fk, ticket_status);

        ticketDao.createNewTicket(t);

        return t;
    }


    public List<Ticket> retrieveAllSubmittedTickets() {
        return ticketDao.viewAllSubmittedTickets();
    }

    public List<Ticket> viewAllPendingTickets(String ticket_status) {
        return ticketDao.viewAllPendingTickets(ticket_status);
    }

    public List<Ticket> viewAllEmployeeSubmittedTickets(String ticket_submitter) {
        return ticketDao.viewAllEmployeeSubmittedTickets(ticket_submitter);
    }



    public Ticket filterTicketsByStatus (String ticket_submitter, String ticket_status) {
                return ticketDao.filterTicketsByStatus(ticket_submitter, ticket_status);

}

    public Ticket filterByTicketStatus (String ticket_status) {
        return ticketDao.filterByTicketStatus(ticket_status);

    }


    public Ticket getByTicketID(int ticket_ID) throws TicketDoesNotExistException {
        return ticketDao.getByTicketID(ticket_ID);
    }

    public Ticket getByTicketSubmitter(String ticketSubmitter) {
        return ticketDao.getByTicketSubmitter(ticketSubmitter);
    }


    public void updateTicketStatus(int ticket_id, String ticket_status, String newTicketStatus) throws CannotUpdateException {
        Ticket t = ticketDao.getByTicketID(ticket_id);



        if (t == null) {

            return;

        }

        if (ticket_status.equals("Pending")) {
            if(!newTicketStatus.equals("")){
                t.setTicket_status(newTicketStatus);
                System.out.println("That is a valid answer.");
            }
        } else {
            throw new CannotUpdateException();
        }

        ticketDao.updateTicketStatus(ticket_status, ticket_id);

    }

}