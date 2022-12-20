package com.revature.service;

import java.util.ArrayList;
import java.util.List;

import com.revature.controllers.AuthController;
import com.revature.exception.CannotUpdateException;
import com.revature.exception.MissingRequiredTicketInformationException;
import com.revature.exception.TicketDoesNotExistException;
import com.revature.dao.TicketDao;
import com.revature.models.Employee;
import com.revature.models.Ticket;

import static com.revature.controllers.AuthController.ses;

public class TicketService {

    private TicketDao ticketDao;

    public TicketService(TicketDao ticketDao) {
        this.ticketDao = ticketDao;
    }

    public Ticket createNewTicket(String ticket_name, int expense_date, String expense_description, Double expense_amount, String ticket_submitter, int
            expense_Type_fk, String ticket_status) throws MissingRequiredTicketInformationException {


        if (expense_description.isEmpty() || ticket_submitter.isEmpty() || expense_amount <= 0.00) {
            throw new MissingRequiredTicketInformationException();

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

        List<Ticket> allTickets = ticketDao.viewAllSubmittedTickets();
        List<Ticket> allSubmittedTickets = new ArrayList<>();

        for(Ticket t: allTickets) {
                allSubmittedTickets.add(t);
            }

        return allSubmittedTickets;

        }




    public Ticket getByTicketID(int ticket_id) throws TicketDoesNotExistException {
        List<Ticket> allTickets = ticketDao.viewAllSubmittedTickets();

        for (Ticket t: allTickets){
            if(t.getTicket_Id() == (ticket_id)) {
                return t;
            }


        }
        throw new TicketDoesNotExistException();
    }

    public List<Ticket> viewAllEmployeeSubmittedTickets(String ticket_submitter) {


        Employee employee = (Employee) AuthController.ses.getAttribute("user_level");
        System.out.println(employee);

        if(employee.equals("Employee")){
            return ticketDao.viewAllEmployeeSubmittedTickets(ticket_submitter);
        }

        return null;
    }


    public boolean updateTicketStatus(int ticket_id, String ticket_status) throws CannotUpdateException, TicketDoesNotExistException {

        Ticket t = ticketDao.getByTicketID(ticket_id);

        if (t == null) {
            return false;
        }

        if (ticket_status.equals("Pending")) {
                t.setTicket_status(ticket_status);
                System.out.println("That is a valid answer.");
        } else {
            throw new CannotUpdateException();
        }

        ticketDao.updateTicketStatus(ticket_status, ticket_id);
        return false;
    }

//    public void updateTicketStatus(int ticket_id, String ticket_status, String newTicketStatus) throws CannotUpdateException, TicketDoesNotExistException {
//        Ticket t = ticketDao.getByTicketID(ticket_id);
//
//        if (t == null) {
//            return;
//        }
//
//        if (!ticket_status.equals("Pending")) {
//            if(!newTicketStatus.equals("")){
//                t.setTicket_status(newTicketStatus);
//                System.out.println("That is a valid answer.");
//            }
//        } else {
//            throw new CannotUpdateException();
//        }
//
//        ticketDao.updateTicketStatus(ticket_status, ticket_id);
//    }

    public Ticket filterByTicketStatus(String ticket_status) {
        List<Ticket> allTickets = ticketDao.viewAllSubmittedTickets();

        for (Ticket t: allTickets){
            if(t.getticket_status().equals(ticket_status)) {
                System.out.println(t);
            }


        }
        return null;
    }



//    public List<Ticket> viewAllPendingTickets(String ticket_status) {
//        List<Ticket> allTickets = ticketDao.viewAllPendingTickets(ticket_status);
//
//        for (Ticket t: allTickets){
//            if (t.getticket_status().equals(ticket_status)){
//            return t;
//            }
//
//        }
//        return null;
//    }


    /*------------------------NOT USED---------------------------------*/

/*
    public List<Ticket> viewAllPendingTickets(String ticket_status) {
        return ticketDao.viewAllPendingTickets(ticket_status);
    }


    public List<Ticket> viewAllEmployeeTickets(Employee e) {
        List<Ticket> allTickets = ticketDao.viewAllSubmittedTickets();
        List<Ticket> employeeTickets = new ArrayList<>();

        for (Ticket t: allTickets){
            if(t.getticket_submitter() == (e.getEmployee_first_name() + e.getEmployee_last_name())) {
                employeeTickets.add(t);
            }


        }
        return employeeTickets;
    }



    public Ticket filterTicketsByStatus (String ticket_submitter, String ticket_status) {
                return ticketDao.filterTicketsByStatus(ticket_submitter, ticket_status);

}

    public Ticket filterByTicketStatus (String ticket_status) {
        List<Ticket> allTickets = ticketDao.viewAllSubmittedTickets();

        for (Ticket t: allTickets){
            if(t.getticket_status().equals(ticket_status)) {
                return t;
            }


        }
        return null;
    }

//
//
//
//
//
//    public Ticket getByTicketSubmitter(String ticketSubmitter) {
//        return ticketDao.getByTicketSubmitter(ticketSubmitter);
//    }
*/
}


