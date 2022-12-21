package com.revature.dao;

import com.revature.exception.EmployeeDoesNotExistException;
import com.revature.exception.UsernameAlreadyExistsException;
import com.revature.models.Employee;

import java.util.List;

public interface EmployeeDao {
    List<Employee> verifyEmployeeUsernames(String employeeUsername) throws UsernameAlreadyExistsException;
    Employee createNewEmployee(Employee e) throws UsernameAlreadyExistsException;

    List<Employee> getAllEmployees();

    Employee employeeLoginByUsernamePassword(String employee_username, String employee_password) throws EmployeeDoesNotExistException;

}