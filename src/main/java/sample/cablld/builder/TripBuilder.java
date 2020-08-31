package sample.cablld.builder;

import sample.cablld.models.Booking.Booking;
import sample.cablld.models.Location;
import sample.cablld.models.trips.Trip;

import java.sql.Timestamp;

public class TripBuilder {

    public static Trip buildTrip(Booking booking, Location driverLocation, Timestamp tripStartTime){
        Trip trip=new Trip();
        trip.setStartLocation(driverLocation);
        trip.setTripStartTime(tripStartTime);
        trip.setBooking(booking);
        return trip;
    }
}
