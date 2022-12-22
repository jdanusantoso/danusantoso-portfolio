package com.revature.controllers;

import com.google.gson.Gson;
import com.revature.dao.EmployeeDaoJDBC;
import com.revature.dao.TicketDaoJDBC;
import com.revature.exception.UsernameAlreadyExistsException;
import com.revature.models.Employee;
import com.revature.service.EmployeeService;
import com.revature.service.TicketService;
import io.javalin.http.Handler;

public class EmployeeController {

    private static EmployeeService employeeService = new EmployeeService(new EmployeeDaoJDBC(), new TicketService(new TicketDaoJDBC()));
/*
    public Handler verifyEmployeeUsernamesHandler = (ctx) -> {

        String body = ctx.body();

        Gson gson = new Gson();

        Employee newE = gson.fromJson(body, Employee.class);

        newE = employeeService.verifyEmployeeUsernames(newE.getEmployee_username());

        if(newE != null){
            ctx.status(201);
            ctx.result("Employee username does not exist yet.");

        }else{
            ctx.status(406);
            ctx.result("Employee username already exists.");



        }



    };
*/

    public Handler createNewEmployee = (ctx) -> {

        String body = ctx.body();

        Gson gson = new Gson();

        Employee newE = gson.fromJson(body, Employee.class);

        newE = employeeService.createNewEmployee(newE.getEmployee_first_name(), newE.getEmployee_last_name(), newE.getEmployee_email(), newE.getEmployee_username(), newE.getEmployee_password(), newE.getUser_level());


        System.out.println(newE);
        if(newE != null){
            ctx.status(201);
            ctx.result(body); //Send back the employee
        }

        else{
            ctx.status(406);
            ctx.result("You are trying to input a username that already exists. Please choose another.");
        }

    };

}
