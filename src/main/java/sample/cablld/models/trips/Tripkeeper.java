package sample.cablld.models.trips;

import sample.cablld.models.driver.Driver;
import sample.cablld.models.rider.Rider;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Tripkeeper {
    static Map<Rider, List<Trip>> riderTripMap=new ConcurrentHashMap<Rider, List<Trip>>();
    static Map<Driver,List<Trip>> driverTripMap=new ConcurrentHashMap<Driver, List<Trip>>();

    public static void addTrips(Trip trip){
        Rider rider=trip.getBooking().getRider();
        if(riderTripMap.get(rider)==null)
            riderTripMap.put(rider,new LinkedList<>());
        riderTripMap.get(rider).add(trip);
        Driver driver=trip.getBooking().getDriver();
        if(driverTripMap.get(driver)==null)
            driverTripMap.put(driver,new LinkedList<>());
        driverTripMap.get(driver).add(trip);

    }

    public static List<Trip> getTripData(Driver driver){
        return driverTripMap.get(driver);
    }

    public static List<Trip> getTripData(Rider rider){
        return riderTripMap.get(rider);
    }

}
