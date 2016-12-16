package com.entities;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Alex Ichim on 16.12.2016.
 */
public class PackageTracking implements Serializable {

    private int packageTrackingId;
    private int packageId;
    private String packageTrackingCity;
    private Date packageTrackingDate;


    public PackageTracking(int packageTrackingId, int packageId, String packageTrackingCity, Date packageTrackingDate) {
        this.packageTrackingId = packageTrackingId;
        this.packageId = packageId;
        this.packageTrackingCity = packageTrackingCity;
        this.packageTrackingDate = packageTrackingDate;
    }

    public int getPackageTrackingId() {
        return packageTrackingId;
    }

    public void setPackageTrackingId(int packageTrackingId) {
        this.packageTrackingId = packageTrackingId;
    }

    public int getPackageId() {
        return packageId;
    }

    public void setPackageId(int packageId) {
        this.packageId = packageId;
    }

    public String getPackageTrackingCity() {
        return packageTrackingCity;
    }

    public void setPackageTrackingCity(String packageTrackingCity) {
        this.packageTrackingCity = packageTrackingCity;
    }

    public Date getPackageTrackingDate() {
        return packageTrackingDate;
    }

    public void setPackageTrackingDate(Date packageTrackingDate) {
        this.packageTrackingDate = packageTrackingDate;
    }
}
