package sample.cablld.services.location;

import sample.cablld.models.Location;
import sample.cablld.models.driver.Driver;

import java.util.List;

@FunctionalInterface
public interface INearByDrivers {

    public List<Driver> getNearByDrivers(Location location);
}
