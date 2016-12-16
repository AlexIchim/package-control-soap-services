package com.entities;

import java.io.Serializable;

/**
 * Created by Alex Ichim on 16.12.2016.
 */
public class PackageCl implements Serializable {

    private Integer packageId;
    private String packageSender;
    private String packageReceiver;
    private String packageName;
    private String packageDescription;
    private String senderCity;
    private String destinationCity;
    private boolean tracking;


    public PackageCl(Integer packageId, String packageSender, String packageReceiver, String packageName, String packageDescription, String senderCity, String destinationCity, boolean tracking) {
        this.packageId = packageId;
        this.packageSender = packageSender;
        this.packageReceiver = packageReceiver;
        this.packageName = packageName;
        this.packageDescription = packageDescription;
        this.senderCity = senderCity;
        this.destinationCity = destinationCity;
        this.tracking = tracking;
    }

    public Integer getPackageId() {
        return packageId;
    }

    public void setPackageId(Integer packageId) {
        this.packageId = packageId;
    }

    public String getPackageSender() {
        return packageSender;
    }

    public void setPackageSender(String packageSender) {
        this.packageSender = packageSender;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getPackageDescrition() {
        return packageDescription;
    }

    public void setPackageDescrition(String packageDescrition) {
        this.packageDescription = packageDescrition;
    }

    public String getSenderCity() {
        return senderCity;
    }

    public void setSenderCity(String senderCity) {
        this.senderCity = senderCity;
    }

    public String getDestinationCity() {
        return destinationCity;
    }

    public void setDestinationCity(String destinationCity) {
        this.destinationCity = destinationCity;
    }

    public boolean isTracking() {
        return tracking;
    }

    public void setTracking(boolean tracking) {
        this.tracking = tracking;
    }

    public String getPackageReceiver() {
        return packageReceiver;
    }

    public void setPackageReceiver(String packageReceiver) {
        this.packageReceiver = packageReceiver;
    }
}

