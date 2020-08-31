package sample.cablld.services.driverjourney;

import sample.cablld.models.Location;
import sample.cablld.models.driver.Driver;

public interface IDriverEngine {

    void onTripStart(Driver driver);
    void onTripEnd(Driver driver);
    void onBooked(Driver driver);
    void onBookingCacelled(Driver driver);
    void onLocationChange(Driver driver, Location location);
}
