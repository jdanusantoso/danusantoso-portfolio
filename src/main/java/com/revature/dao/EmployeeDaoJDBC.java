package com.revature.dao;

import com.revature.models.Employee;
import com.revature.util.JDBCConnectionUTIL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeDaoJDBC implements EmployeeDao {

        JDBCConnectionUTIL conUtil = JDBCConnectionUTIL.getInstance();

    @Override
    public Employee createNewEmployee(Employee e) {
        try {

            Connection connection = conUtil.getConnectionThroughENV();

            String sql =

                    "INSERT INTO employee (employee_first_name, employee_last_name, employee_email, " +
                            "employee_username, employee_password, user_level) "


                            + "VALUES (?,?,?,?,?,?)";

            PreparedStatement prepared = connection.prepareStatement(sql);

            prepared.setString(1, e.getEmployee_first_name());
            prepared.setString(2, e.getEmployee_last_name());
            prepared.setString(3, e.getEmployee_email());
            prepared.setString(4, e.getEmployee_username());
            prepared.setString(5, e.getEmployee_password() );
            prepared.setString(6, e.getUser_level());


            prepared.execute();

            return e;

        } catch(SQLException create_emp) {
            create_emp.printStackTrace();
        }

        return null;


    }

        public Employee employeeLoginByEmailPassword(String employee_email, String employee_password) {

            Employee employee = null;

            try {

                Connection connection = conUtil.getConnectionThroughENV();

                String sql = "SELECT * FROM employee WHERE employee_email =? and employee_password = ?";
                PreparedStatement prepared = connection.prepareStatement(sql);
                prepared.setString(1, employee_email);
                prepared.setString(2, employee_password);

                ResultSet results = prepared.executeQuery();

                while(results.next()) {
                    employee = new Employee();

                    employee.setEmployee_id(results.getInt(1));
                    employee.setEmployee_first_name(results.getString(2));
                    employee.setEmployee_last_name(results.getString(3));
                    employee.setEmployee_username(results.getString(4));
                    employee.setEmployee_password(results.getString(5));
                }

            }catch(SQLException e) {
                e.printStackTrace();
            }

            return employee;
        }
    }



