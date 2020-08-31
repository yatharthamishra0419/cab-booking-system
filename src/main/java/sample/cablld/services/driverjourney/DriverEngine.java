package sample.cablld.services.driverjourney;

import sample.cablld.models.driver.DriverAvailabilty;
import sample.cablld.models.trips.Trip;

import java.sql.Timestamp;

public abstract class DriverEngine implements IDriverEngine {

    public void start(Trip trip) {
        DriverAvailabilty driverAvailabilty=trip.getBooking().getDriver().getDriverAvailabilty();
        driverAvailabilty.setLastLocationTracked(trip.getStartLocation());
        driverAvailabilty.setLastUpdatedTimestamp(new Timestamp(System.currentTimeMillis()));
        onTripStart(trip.getBooking().getDriver());

    }

    public void end(Trip trip) {
        DriverAvailabilty driverAvailabilty=trip.getBooking().getDriver().getDriverAvailabilty();
        driverAvailabilty.setLastLocationTracked(trip.getEndLocation());
        driverAvailabilty.setLastUpdatedTimestamp(new Timestamp(System.currentTimeMillis()));
        onTripEnd(trip.getBooking().getDriver());
    }
}
