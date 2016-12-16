package com.dao;

import com.entities.PackageTracking;

import java.util.ArrayList;

/**
 * Created by Alex Ichim on 17.12.2016.
 */
public interface PackageTrackingDAO {

    ArrayList<PackageTracking> checkStatus(int packageIdToCheck);
}
