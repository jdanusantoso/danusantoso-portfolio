package com.revature.dao;

import java.util.List;

import com.revature.exception.CannotUpdateException;
import com.revature.exception.TicketDoesNotExistException;
import com.revature.models.Employee;
import com.revature.models.Ticket;

public interface TicketDao {

    //Employee Ticket Methods

    Ticket createNewTicket(Ticket t);

    List<Ticket> viewAllEmployeeSubmittedTickets(String ticket_submitter);



    //Manager Ticket Methods

    List<Ticket> viewAllSubmittedTickets();

    Ticket getByTicketID(int ticket_id) throws TicketDoesNotExistException ;

    boolean updateTicketStatus (String ticket_status, int ticket_id) throws CannotUpdateException;

    List<Ticket> viewAllPendingTickets(String ticket_status);

    /* --------------------------Unused Extra Methods-------------------------------- */
    List<Ticket> viewAllEmployeeTickets(Employee E);

    Ticket getByTicketSubmitter(String ticketSubmitter) ;

    Ticket filterTicketsByStatus(String ticket_submitter, String ticket_status);

    Ticket filterByTicketStatus(String ticket_status);




}