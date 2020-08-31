package sample.cablld.models.trips;

import sample.cablld.models.driver.Driver;
import sample.cablld.models.rider.Rider;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Tripkeeper {
    Map<Rider, List<Trip>> riderTripMap=new ConcurrentHashMap<Rider, List<Trip>>();
    Map<Driver,List<Trip>> driverTripMap=new ConcurrentHashMap<Driver, List<Trip>>();
}
