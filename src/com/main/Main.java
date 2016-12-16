package com.main;

import com.dao.impl.UsersDAOImpl;
import com.dao.impl.UsersDAOImpl;

/**
 * Created by Alex Ichim on 17.12.2016.
 */
public class Main {

    public static void main(String[] args) {
        UsersDAOImpl usersDAO = new UsersDAOImpl();
        usersDAO.register("Alex", "parola");
    }
}
