package com.revature.service;

import com.revature.exception.EmployeeDoesNotExistException;
import com.revature.dao.EmployeeDao;
import com.revature.exception.UsernameAlreadyExistsException;
import com.revature.models.Employee;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeService {

    private EmployeeDao employeeDao;
    private TicketService ticketService;


    public EmployeeService(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;

    }


    public EmployeeService(EmployeeDao employeeDao, TicketService ticketService) {
        this.employeeDao = employeeDao;
        this.ticketService = ticketService;
    }

    public Employee verifyEmployeeUsernames(String employee_username) throws UsernameAlreadyExistsException {

        List<Employee> employee = employeeDao.getAllEmployees();



        for (Employee e : employee) {
            if (e.getEmployee_username().equals(employee_username)) {
                System.out.println(e.getEmployee_username().equals(employee_username));


            }else{

                System.out.println(e.getEmployee_username());
                return null;

            }
        }

        //You may want to instead throw an exception
        throw new UsernameAlreadyExistsException();
    }

    public Employee createNewEmployee(String employee_first_name, String employee_last_name, String employee_email,
                                      String employee_username,  String employee_password, String user_level) throws UsernameAlreadyExistsException, SQLException {


        List<Employee> employee = employeeDao.getAllEmployees();

        if(employee != null){
            Employee e = new Employee (employee_first_name, employee_last_name, employee_email, employee_username, employee_password, user_level);

            employeeDao.createNewEmployee(e);
            return e;
        }
        return null;


    }



    public Employee employeeLoginByUsernamePassword(String employee_username, String employee_password) throws EmployeeDoesNotExistException {

        List<Employee> employee = employeeDao.getAllEmployees();

        for (Employee e : employee) {
            if (e.getEmployee_username().equals(employee_username) && e.getEmployee_password().equals(employee_password)) {
                return e;
            }
        }

        //You may want to instead throw an exception
        throw new EmployeeDoesNotExistException();
    }

}