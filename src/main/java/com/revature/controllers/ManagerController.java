package com.revature.controllers;

import com.google.gson.Gson;
import com.revature.dao.ManagerDaoJDBC;
import com.revature.models.Manager;
import io.javalin.http.Handler;

public class ManagerController {

    ManagerDaoJDBC mDAO = new ManagerDaoJDBC();

    public Handler createNewManager = (ctx) -> {

        String body = ctx.body();

        Gson gson = new Gson();

        Manager newM = gson.fromJson(body, Manager.class);

        if(mDAO.createNewManager(newM) !=null){
            ctx.status(201);
            ctx.result(body); //Send back the employee
        }else{
            ctx.status(406);
            ctx.result("Manager registration failed.");
        }

    };

}
