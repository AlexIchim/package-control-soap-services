package com.dao;

import com.entities.User;

/**
 * Created by Alex Ichim on 17.12.2016.
 */
public interface UsersDAO {

    User login(String username, String password);

    int register(String username, String password);
}
