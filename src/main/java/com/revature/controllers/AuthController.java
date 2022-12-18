package com.revature.controllers;

import com.google.gson.Gson;
import com.revature.dao.EmployeeDaoJDBC;
import com.revature.dao.ManagerDaoJDBC;
import com.revature.models.Employee;
import com.revature.models.Manager;
import io.javalin.http.Handler;

import javax.servlet.http.HttpSession;

public class AuthController {

    EmployeeDaoJDBC eDao = new EmployeeDaoJDBC();

    ManagerDaoJDBC mDao = new ManagerDaoJDBC();

    public static HttpSession ses;

    public Handler employeeLoginHandler = (ctx) -> {

        String body = ctx.body();

        Gson gson = new Gson();

        Employee eLDTO = gson.fromJson(body, Employee.class);

        Employee empLoggedIn = eDao.employeeLoginByUsernamePassword(eLDTO.getEmployee_username(), eLDTO.getEmployee_password());

        if(empLoggedIn != null){

            ses = ctx.req.getSession();

            String userJSON = gson.toJson(empLoggedIn);

            ctx.result(userJSON);
            ctx.status(202);

        }else{
            ctx.status(401);
        }

    };

    public Handler managerLoginHandler = (ctx) -> {

        String body = ctx.body();

        Gson gson = new Gson();

        Manager mLDTO = gson.fromJson(body, Manager.class);

        Manager mLoggedIn = mDao.loginByUsernamePassword(mLDTO.getUsername(), mLDTO.getPassword());

        if(mLoggedIn != null){

            ses = ctx.req.getSession();

            String userJSON = gson.toJson(mLoggedIn);

            ctx.result(userJSON);
            ctx.status(202);

        }else{
            ctx.status(401);
        }

    };

}
