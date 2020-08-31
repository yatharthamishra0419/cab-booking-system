package sample.cablld.services.location;

import sample.cablld.constants.IConstants;
import sample.cablld.models.driver.DriverGridContainer;
import sample.cablld.models.driver.DriverStatus;

import java.util.stream.Collectors;

public class NearByDriverFactory {

    public static synchronized INearByDrivers getNearByDrivers(LocationAlgo locationAlgo){
         switch (locationAlgo){
             case STANDARD:
                 return location -> (
                     DriverGridContainer.getDriverByGrid(location.getGrid()).stream().filter(
                             driver -> driver.getDriverAvailabilty().getDriverStatus().equals(DriverStatus.AVAILABLE)).
                             filter
                             (driver ->
                                     (Math.sqrt(Math.pow(driver.getDriverAvailabilty().getLastLocationTracked().getY()-
                                                     location.getY(),2)+
                                             Math.pow(driver.getDriverAvailabilty().getLastLocationTracked().getX()-
                                                     location.getX(),2))< IConstants.ApplicationConstants.MAX_DISTANCE_DRIVER)


                             ).collect(Collectors.toList())
                     );
         }
         return null;
    }

}
