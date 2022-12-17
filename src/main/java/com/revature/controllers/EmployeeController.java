package com.revature.controllers;

import com.google.gson.Gson;
import com.revature.dao.EmployeeDaoJDBC;
import com.revature.models.Employee;
import io.javalin.http.Handler;

public class EmployeeController {

    EmployeeDaoJDBC eDAO = new EmployeeDaoJDBC();

    public Handler createNewEmployee = (ctx) -> {

        String body = ctx.body();

        Gson gson = new Gson();

        Employee newE = gson.fromJson(body, Employee.class);

        if(eDAO.createNewEmployee(newE) !=null){
            ctx.status(201);
            ctx.result(body); //Send back the employee
        }else{
            ctx.status(406);
            ctx.result("Employee registration failed.");
        }

    };

}
