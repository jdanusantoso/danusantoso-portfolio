package com.revature.dao;

import java.util.List;

import com.revature.models.Ticket;

public interface TicketDao {

    Ticket createNewTicket(Ticket t);

    List<Ticket> viewAllSubmittedTickets();

    List<Ticket> viewAllEmployeeSubmittedTickets(String ticket_submitter);

    List<Ticket> viewAllPendingTickets(String ticket_status);

    Ticket getByTicketID(int ticket_id);

    Ticket getByTicketSubmitter(String ticketSubmitter);

    Ticket filterTicketsByStatus(String ticket_submitter, String ticket_status);

    Ticket filterByTicketStatus(String ticket_status);

    boolean updateTicketStatus (String ticket_status, int ticket_id);


}