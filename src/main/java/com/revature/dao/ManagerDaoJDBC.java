package com.revature.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.revature.models.Employee;
import com.revature.models.Manager;
import com.revature.util.JDBCConnectionUTIL;

public class ManagerDaoJDBC implements ManagerDao  {

    JDBCConnectionUTIL conUtil = JDBCConnectionUTIL.getInstance();

    @Override
    public void createNewManager(Manager m) {
        try {

            Connection connection = conUtil.getConnectionThroughENV();

            String sql = "INSERT INTO manager(employee_first_name, employee_last_name, "
                    + "email, username, password, user_level, employee_id_FK) "
                    + "values (?,?,?,?,?,?,?)";

            PreparedStatement prepared = connection.prepareStatement(sql);

            prepared.setString(1, m.getEmployee_firstName());
            prepared.setString(2, (m.getEmployee_last_Name()));
            prepared.setString(3, m.getEmail());
            prepared.setString(4, m.getUsername());
            prepared.setString(5, (m.getPassword()));
            prepared.setString(6, m.getUser_level());
            prepared.setInt(7, m.getEmployee_Id_FK());

            prepared.execute();

        } catch(SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public Manager loginByUsernamePassword(String username, String password) {

        Manager manager = null;

        try {

            Connection connection = conUtil.getConnectionThroughENV();

            String sql = "SELECT * FROM manager WHERE username =? and password = ?";
            PreparedStatement prepared = connection.prepareStatement(sql);
            prepared.setString(1, username);
            prepared.setString(2, password);

            ResultSet results = prepared.executeQuery();

            while(results.next()) {
                manager = new Manager();

                manager.setManager_Id(results.getInt(1));
                manager.setEmployee_firstName(results.getString(2));
                manager.setEmployee_last_Name(results.getString(3));
                manager.setUsername(results.getString(4));
                manager.setPassword(results.getString(5));
            }

        }catch(SQLException e) {
            e.printStackTrace();
        }

        return manager;
    }




}


