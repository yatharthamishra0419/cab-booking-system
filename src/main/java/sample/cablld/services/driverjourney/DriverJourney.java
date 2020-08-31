package sample.cablld.services.driverjourney;

import org.springframework.stereotype.Service;
import sample.cablld.models.Location;
import sample.cablld.models.driver.Driver;
import sample.cablld.models.driver.DriverGridContainer;
import sample.cablld.models.driver.DriverStatus;

@Service
public class DriverJourney extends DriverEngine {

    @Override
    public void onLocationChange(Driver driver, Location location) {
        // implement location change events here
        if(!location.getGrid().equals(driver.getDriverAvailabilty().getLastLocationTracked().getGrid())){
            DriverGridContainer.changeDriverGrid(driver,location.getGrid());
        }
    }


    public void onTripStart(Driver driver) {
        driver.getDriverAvailabilty().setDriverStatus(DriverStatus.IN_TRIP);
    }

    public void onTripEnd(Driver driver) {
        driver.getDriverAvailabilty().setDriverStatus(DriverStatus.AVAILABLE);
    }

    @Override
    public void onBooked(Driver driver) {
        driver.getDriverAvailabilty().setDriverStatus(DriverStatus.BUSY);
    }

    @Override
    public void onBookingCacelled(Driver driver) {
        driver.getDriverAvailabilty().setDriverStatus(DriverStatus.AVAILABLE);
    }

}
