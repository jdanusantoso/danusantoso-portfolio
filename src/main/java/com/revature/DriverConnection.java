package com.revature;

import com.revature.controllers.EmployeeController;
import com.revature.controllers.TicketController;
import com.revature.util.JDBCConnectionUTIL;
import io.javalin.Javalin;

import java.sql.Connection;
import java.sql.SQLException;

public class DriverConnection {

    public static void main(String[] args) {

        try(Connection conn = JDBCConnectionUTIL.getConnectionThroughENV()){
            System.out.println("Connection Successful");
        }
        catch(SQLException e){
            System.out.println("Connection failed");
            e.printStackTrace();
        }

        Javalin app = Javalin.create(

                //This config lambda lets us specify certain configurations for our Javalin object
                // ->? "For this config object, do the following things"
                config -> {
                    config.enableCorsForAllOrigins(); //This lets us process HTTP Requests from anywhere
                }

        ).start(5000); //we need .start() to start our Java server on port 3000
        //You can do any port, I chose 3000 because probably nothing is using it.
        //a port is like a parking space for an application, where messages etc. can find it

        /*----EndPoint Handlers Below----*/

        //Instantiate Controllers
        EmployeeController ec = new EmployeeController();

        app.post("/createNewEmployee", ec.createNewEmployee);


        TicketController tc = new TicketController();

        app.post("/createNewTicket", tc.createNewTicket);

        app.get("/viewAllEmployeeSubmittedTickets", tc.viewAllEmployeeSubmittedTicketsHandler);

        app.get("/viewAllSubmittedTickets", tc.getTicketHandlerSubmitted);

        app.patch("/updateTicketStatus/{id}", tc.updateTicketStatusHandler);

        app.get("/viewAllPendingTickets", tc.viewAllPendingTicketsHandler);

    }
}
