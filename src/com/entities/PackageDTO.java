package com.entities;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Alex Ichim on 16.12.2016.
 */
public class PackageDTO implements Serializable {

    private ArrayList<PackageCl> packages;

    public PackageDTO(ArrayList<PackageCl> packages) {
        super();
        this.packages = packages;
    }

    public ArrayList<PackageCl> getPackages() {
        return packages;
    }

    public void setPackages(ArrayList<PackageCl> packages) {
        this.packages = packages;
    }
}
