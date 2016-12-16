package com.entities;

import java.util.ArrayList;

/**
 * Created by Alex Ichim on 16.12.2016.
 */
public class PackageTrackingDTO {
    private ArrayList<PackageTracking> packageTrackings;


    public PackageTrackingDTO(ArrayList<PackageTracking> packageTrackings) {
        super();
        this.packageTrackings = packageTrackings;
    }

    public ArrayList<PackageTracking> getPackageTrackings() {
        return packageTrackings;
    }

    public void setPackageTrackings(ArrayList<PackageTracking> packageTrackings) {
        this.packageTrackings = packageTrackings;
    }
}
