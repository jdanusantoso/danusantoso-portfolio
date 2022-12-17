package com.revature.dao;

import com.revature.models.Employee;

public interface EmployeeDao {

    Employee createNewEmployee(Employee e);

    Employee employeeLoginByEmailPassword(String employeeUsername, String employeePassword);
}