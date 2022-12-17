package com.revature.service;

import com.revature.exception.EmployeeDoesNotExistException;
import com.revature.dao.EmployeeDao;
import com.revature.models.Employee;

public class EmployeeService {

    private EmployeeDao employeeDao;
    private TicketService ticketService;


    public EmployeeService(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;

    }


    public EmployeeService(TicketService ticketService) {
        this.ticketService = ticketService;
    }





    public Employee createNewEmployee(String employee_first_name, String employee_last_name, String employee_email,
                                      String employee_username,  String employee_password, String user_level) {

        Employee e = new Employee();
        //We are not setting the id, this will be set on the database
        //We could have created a special constructor with these specific parameters for this use case
        e.setEmployee_first_name(employee_first_name);
        e.setEmployee_last_name(employee_last_name);
        e.setEmployee_email(employee_email);
        e.setEmployee_username(employee_username);
        e.setEmployee_password(employee_password);
        e.setUser_level(user_level);


        employeeDao.createNewEmployee(e);

        return e;

    }

    public Employee employeeLoginByEmailPassword(String employee_email, String employee_password) throws EmployeeDoesNotExistException {
        Employee e = new Employee();
        e= employeeDao.employeeLoginByEmailPassword(employee_email, employee_password);

        if(employee_email == null) {

            throw new EmployeeDoesNotExistException();
        }

        return e;
    }

}