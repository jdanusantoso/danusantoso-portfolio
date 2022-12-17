package com.revature.dao;

import com.revature.models.Manager;

public interface ManagerDao {

    void createNewManager(Manager m);

    Manager loginByUsernamePassword (String username, String Password);




}

