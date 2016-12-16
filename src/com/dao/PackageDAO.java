package com.dao;

import com.entities.PackageCl;

import java.util.ArrayList;

/**
 * Created by Alex Ichim on 17.12.2016.
 */
public interface PackageDAO {

    ArrayList<PackageCl> getClientPackages(String clientId);

    ArrayList<PackageCl> getPackagesById(String packageName);
}
