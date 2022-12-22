package com.revature.controllers;

import com.google.gson.Gson;
import com.revature.dao.EmployeeDaoJDBC;
import com.revature.dao.TicketDaoJDBC;
import com.revature.models.Employee;
import com.revature.service.EmployeeService;
import com.revature.service.TicketService;
import io.javalin.http.Handler;

public class EmployeeController {

    private static EmployeeService employeeService = new EmployeeService(new EmployeeDaoJDBC(), new TicketService(new TicketDaoJDBC()));

    EmployeeDaoJDBC eDao = new EmployeeDaoJDBC();

    public Handler verifyEmployeeUsernamesHandler = (ctx) -> {

        String body = ctx.body();

        Gson gson = new Gson();

        Employee newE = gson.fromJson(body, Employee.class);

        newE = employeeService.verifyEmployeeUsernames(newE.getEmployee_username());

        if(newE != null){
            ctx.status(201);
            ctx.result(body);

        }else{
            ctx.status(406);
            ctx.result("Employee username already exists.");



        }



    };

    public Handler createNewEmployee = (ctx) -> {

        String body = ctx.body();

        Gson gson = new Gson();

        Employee newE = gson.fromJson(body, Employee.class);

        newE = eDao.createNewEmployee(newE);

//        System.out.println(newE);
        if(newE != null){
            ctx.status(201);
            ctx.result(body); //Send back the employee
        }

        else{
            ctx.status(406);
            ctx.result("You are trying to input a username that already exists. Please choose another.");
        }

    };

    public Handler updateEmployeeLastNameHandler = (ctx) -> {

        if(AuthController.ses != null){

            System.out.println(AuthController.ses.getAttribute("user_level"));
            System.out.println(AuthController.ses.getAttribute("employee_id"));

            if(AuthController.ses.getAttribute("employee_id") == null){
                ctx.status(403);
                ctx.result("You must be logged as an manager in order to perform this action.");
                return;
            }

            int ticket_id = Integer.parseInt(ctx.pathParam("id"));
            System.out.println(ticket_id);

            String employee_last_name = ctx.body();

            String employee_email = ctx.body();

//        System.out.println(ticket_status);

            if (employeeService.updateEmployeeLastName(employee_last_name, ticket_id)) {
                ctx.status(202);
                ctx.result("Employee information update success.");

            } else {
                ctx.status(406);
                ctx.result("Employee information update failed.");

            }
        }else{
            ctx.result("You must be logged in order to perform this action.");
            ctx.status(401);
        }

    };

    public Handler updateEmployeeEmailHandler = (ctx) -> {

        if(AuthController.ses != null){

            System.out.println(AuthController.ses.getAttribute("user_level"));
            System.out.println(AuthController.ses.getAttribute("employee_id"));

            if(AuthController.ses.getAttribute("employee_id") == null){
                ctx.status(403);
                ctx.result("You must be logged as an manager in order to perform this action.");
                return;
            }

            int ticket_id = Integer.parseInt(ctx.pathParam("id"));
            System.out.println(ticket_id);

            String employee_last_name = ctx.body();

            String employee_email = ctx.body();

//        System.out.println(ticket_status);

            if (employeeService.updateEmployeeEmail(employee_email, ticket_id)) {
                ctx.status(202);
                ctx.result("Employee information update success.");

            } else {
                ctx.status(406);
                ctx.result("Employee information update failed.");

            }
        }else{
            ctx.result("You must be logged in order to perform this action.");
            ctx.status(401);
        }

    };




}
