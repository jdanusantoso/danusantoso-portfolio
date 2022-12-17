package com.revature.models;

import java.util.List;

public class Employee {

    private int employee_id;
    private String employee_first_name;
    private String employee_last_name;
    private String employee_email;
    private String employee_username;
    private String employee_password;
    private String user_level;
    private int ticket_id;

    public Employee () {

        //TODO make an all args when we have completed the class

    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getEmployee_first_name() {
        return employee_first_name;
    }

    public void setEmployee_first_name(String employee_first_name) {
        this.employee_first_name = employee_first_name;
    }

    public String getEmployee_last_name() {
        return employee_last_name;
    }

    public void setEmployee_last_name(String employee_last_name) {
        this.employee_last_name = employee_last_name;
    }

    public String getEmployee_email() {
        return employee_email;
    }

    public void setEmployee_email(String employee_email) {
        this.employee_email = employee_email;
    }

    public String getEmployee_username() {
        return employee_username;
    }

    public void setEmployee_username(String employee_username) {
        this.employee_username = employee_username;
    }

    public String getEmployee_password() {
        return employee_password;
    }

    public void setEmployee_password(String employee_password) {
        this.employee_password = employee_password;
    }

    public String getUser_level() {
        return user_level;
    }

    public void setUser_level(String user_level) {
        this.user_level = user_level;
    }

    public int getTicket_id() {
        return ticket_id;
    }

    public void setTicket_id(int ticket_id) {
        this.ticket_id = ticket_id;
    }

    @Override
    public String toString() {
        return "Employee [employee_id=" + employee_id + ", employee_first_name=" + employee_first_name
                + ", employee_last_name=" + employee_last_name + ", employee_email=" + employee_email
                + ", employee_username=" + employee_username + ", employee_password=" + employee_password
                + ", user_level=" + user_level + ", ticket_id=" + ticket_id + "]";
    }



}


