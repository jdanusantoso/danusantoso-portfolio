package com.revature.dao;

import com.revature.exception.ManagerDoesNotExistException;
import com.revature.models.Manager;

import java.sql.SQLException;
import java.util.List;

public interface ManagerDao {

    Manager createNewManager(Manager m) throws SQLException;

    List<Manager> getAllManagers();

    Manager loginByUsernamePassword (String username, String Password) throws ManagerDoesNotExistException;




}

