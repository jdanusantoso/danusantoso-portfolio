package com.revature.controllers;

import com.google.gson.Gson;
import com.revature.dao.ManagerDaoJDBC;
import com.revature.dao.TicketDaoJDBC;
import com.revature.exception.ManagerDoesNotExistException;
import com.revature.models.Employee;
import com.revature.models.Manager;
import com.revature.service.ManagerService;
import com.revature.service.TicketService;
import io.javalin.http.Handler;

public class ManagerController {

    private static ManagerService managerService = new ManagerService(new ManagerDaoJDBC(), new TicketService(new TicketDaoJDBC()));

    ManagerDaoJDBC mDAO = new ManagerDaoJDBC();


    public Handler createNewManager = (ctx) -> {

        String body = ctx.body();

        Gson gson = new Gson();

        Manager newM = gson.fromJson(body, Manager.class);


        try {
            newM = managerService.createNewManager(newM.getEmployee_firstName(), newM.getEmployee_last_Name(), newM.getEmail(), newM.getUsername(), newM.getPassword(), newM.getmUser_level(), newM.getEmployee_Id_FK());
        } catch (ManagerDoesNotExistException e) {
            throw new RuntimeException(e);
        }


        System.out.println(newM);
        if(newM != null){
            ctx.status(201);
            ctx.result(body);

        }

        else{
            ctx.status(406);
            ctx.result("You are trying to input a username that already exists. Please choose another.");
        }

    };

}
