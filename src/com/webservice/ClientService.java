package com.webservice;

import com.entities.PackageDTO;
import com.entities.PackageTrackingDTO;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * Created by Alex Ichim on 16.12.2016.
 */

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface ClientService {

    @WebMethod
    int login(String userName, String userPassword);

    @WebMethod
    int register(String userName, String userPassword);

    @WebMethod
    PackageDTO listAllPackages(String username);

    @WebMethod
    PackageDTO searchPackages(String packageName);

    @WebMethod
    PackageTrackingDTO checkPackageStatus(int packageId);
}
