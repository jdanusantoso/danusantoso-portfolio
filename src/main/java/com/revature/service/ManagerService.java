package com.revature.service;



import com.revature.dao.ManagerDao;
import com.revature.exception.ManagerDoesNotExistException;
import com.revature.models.Manager;


public class ManagerService {

    private ManagerDao managerDao;
    private TicketService ticketService;

    public ManagerService(ManagerDao managerDao, TicketService ticketService) {
        this.managerDao = managerDao;
        this.ticketService = ticketService;
    }

    public Manager createNewManager(String employee_first_Name, String employee_last_Name, String email, String username,
                                    String password, String user_Level, int employee_Id_FK) {

        Manager m = new Manager();

        m.setEmployee_firstName(employee_first_Name);
        m.setEmployee_last_Name(employee_last_Name);
        m.setEmail(email);
        m.setUsername(username);
        m.setPassword(password);
        m.setUser_level(user_Level);
        m.setEmployee_Id_FK(employee_Id_FK);


        managerDao.createNewManager(m);

        return m;

    }

    public Manager loginByUsernamePassword(String username, String password) throws ManagerDoesNotExistException {
        Manager m = new Manager();
        m= managerDao.loginByUsernamePassword(username, password);

        if(username.isEmpty() && password.isEmpty()) {
            throw new ManagerDoesNotExistException();
        }

        return m;
    }
}
