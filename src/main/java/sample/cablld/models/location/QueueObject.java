package sample.cablld.models.location;

import sample.cablld.models.Location;
import sample.cablld.models.driver.Driver;

import java.util.Objects;

public class QueueObject {

    private Driver driver;
    private Location currentLocation;

    public QueueObject(Driver driver, Location currentLocation) {
        this.driver = driver;
        this.currentLocation = currentLocation;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Location getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(Location currentLocation) {
        this.currentLocation = currentLocation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QueueObject that = (QueueObject) o;
        return Objects.equals(driver, that.driver);
    }

    @Override
    public int hashCode() {
        return Objects.hash(driver);
    }
}
