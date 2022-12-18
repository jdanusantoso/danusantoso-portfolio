package com.revature.service;



import com.revature.dao.ManagerDao;
import com.revature.exception.EmployeeDoesNotExistException;
import com.revature.exception.ManagerDoesNotExistException;
import com.revature.exception.UsernameAlreadyExistsException;
import com.revature.models.Employee;
import com.revature.models.Manager;

import java.sql.SQLException;
import java.util.List;


public class ManagerService {

    private ManagerDao managerDao;
    private TicketService ticketService;

    public ManagerService(ManagerDao managerDao, TicketService ticketService) {
        this.managerDao = managerDao;
        this.ticketService = ticketService;
    }

    public Manager createNewManager(String employee_first_Name, String employee_last_Name, String email, String username,
                                    String password, String user_Level, int employee_Id_FK) throws SQLException {

        try {
            Manager m = new Manager(0, employee_first_Name, employee_last_Name, email, username, password, user_Level, employee_Id_FK);
            managerDao.createNewManager(m);
            return m;
        } catch (SQLException ex) {
            return null;
        }


    }

    public Manager loginByUsernamePassword(String username, String password) throws ManagerDoesNotExistException {
        List<Manager> manager = managerDao.getAllManagers();

        for (Manager m : manager) {
            if (m.getUsername().equals(username)) {
                return m;
            }
        }

        //You may want to instead throw an exception
        throw new ManagerDoesNotExistException();
    }
}
