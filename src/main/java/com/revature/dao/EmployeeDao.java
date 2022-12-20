package com.revature.dao;

import com.revature.exception.EmployeeDoesNotExistException;
import com.revature.exception.UsernameAlreadyExistsException;
import com.revature.models.Employee;
import com.revature.models.Ticket;

import java.util.List;

public interface EmployeeDao {

    Employee createNewEmployee(Employee e) throws UsernameAlreadyExistsException;

    List<Employee> getAllEmployees();

    Employee employeeLoginByUsernamePassword(String employeeUsername, String employeePassword) throws EmployeeDoesNotExistException;

    /*----------------------------------------Not Used---------------------------------------------------*/
    Employee employeeLoginByUsername(String employeeUsername) throws EmployeeDoesNotExistException;

}