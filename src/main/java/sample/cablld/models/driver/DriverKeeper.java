package sample.cablld.models.driver;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class DriverKeeper {

    private static List<Driver> driverList=new LinkedList<Driver>();

    public static void add(Driver driver){
        driverList.add(driver);
        DriverGridContainer.addDriverInGrid(driver,driver.getDriverAvailabilty().getLastLocationTracked().getGrid());
    }

    public static List<Driver> getDriverList() {
        return driverList;
    }

    public static Driver find(String email){
        return driverList.stream().filter(driver -> driver.getEmail().equals(email)).collect(Collectors.toList()).get(0);
    }
}
