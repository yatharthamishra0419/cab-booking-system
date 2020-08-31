package sample.cablld.models.driver;

import sample.cablld.models.Location;

import java.sql.Timestamp;

public class DriverAvailabilty {

    private Driver driver;
    private DriverStatus driverStatus;
    private Timestamp lastUpdatedTimestamp;
    private Location lastLocationTracked;

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public DriverStatus getDriverStatus() {
        return driverStatus;
    }

    public void setDriverStatus(DriverStatus driverStatus) {
        this.driverStatus = driverStatus;
    }

    public Timestamp getLastUpdatedTimestamp() {
        return lastUpdatedTimestamp;
    }

    public void setLastUpdatedTimestamp(Timestamp lastUpdatedTimestamp) {
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    }

    public Location getLastLocationTracked() {
        return lastLocationTracked;
    }

    public void setLastLocationTracked(Location lastLocationTracked) {
        this.lastLocationTracked = lastLocationTracked;
    }


}
