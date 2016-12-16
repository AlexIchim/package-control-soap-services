package com.webservice;

import com.dao.PackageDAO;
import com.dao.UsersDAO;
import com.dao.impl.PackagesDAOImpl;
import com.dao.impl.UsersDAOImpl;
import com.entities.PackageDTO;
import com.entities.PackageTrackingDTO;
import com.entities.User;

import javax.jws.WebService;

/**
 * Created by Alex Ichim on 16.12.2016.
 */

@WebService(endpointInterface = "com.webservice.ClientService")
public class ClientServiceImpl implements ClientService {

    @Override
    public int login(String userName, String userPassword) {
        UsersDAO usersDAO = new UsersDAOImpl();

        User user = usersDAO.login(userName, userPassword);

        if (user != null) {
            return userPassword.equals(user.getUserPassword()) ? (user.isAdmin() ? 1: 0) : -2;
        } else {
            return -1;
        }
    }

    @Override
    public int register(String userName, String userPassword) {
        UsersDAO usersDAO = new UsersDAOImpl();
        return usersDAO.register(userName, userPassword);
    }

    @Override
    public PackageDTO listAllPackages(String username) {
        return null;
    }

    @Override
    public PackageDTO searchPackages(String packageName) {
        return null;
    }

    @Override
    public PackageTrackingDTO checkPackageStatus(int packageId) {
        return null;
    }

}
