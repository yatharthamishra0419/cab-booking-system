package sample.cablld.services.registrations;

import org.springframework.stereotype.Service;
import sample.cablld.models.Location;
import sample.cablld.models.driver.Driver;
import sample.cablld.models.driver.DriverAvailabilty;
import sample.cablld.models.driver.DriverKeeper;
import sample.cablld.models.driver.DriverStatus;

import java.sql.Timestamp;

@Service
public class DriverRegisterService {

    public void register(String name, String email, String mobileNumber,Location location){
        DriverAvailabilty driverAvailabilty=new DriverAvailabilty();
        driverAvailabilty.setDriverStatus(DriverStatus.AVAILABLE);
        driverAvailabilty.setLastUpdatedTimestamp(new Timestamp(System.currentTimeMillis()));
        driverAvailabilty.setLastLocationTracked(location);
        Driver driver=new Driver();
        driver.setDriverAvailabilty(driverAvailabilty);
        driver.setEmail(email);
        driver.setMobileNumber(mobileNumber);
        driver.setName(name);
        driverAvailabilty.setDriver(driver);
        DriverKeeper.add(driver);
    }
}
