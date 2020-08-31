package sample.cablld.services.journey;

import sample.cablld.builder.TripBuilder;
import sample.cablld.models.Booking.Booking;
import sample.cablld.models.Location;
import sample.cablld.models.trips.Trip;
import sample.cablld.services.driverjourney.DriverJourney;
import sample.cablld.services.riderjourney.RiderJourney;

import java.sql.Timestamp;

public abstract class TripEngine {

    public Trip start(Booking booking, Location driverLocation,DriverJourney driverJourney,RiderJourney riderJourney){
        Trip trip=TripBuilder.buildTrip(booking,driverLocation,new Timestamp(System.currentTimeMillis()));
        driverJourney.start(trip);
        riderJourney.start(trip);
        onStart(trip);
        return trip;
    }

    public void end(Trip trip,DriverJourney driverJourney,RiderJourney riderJourney){
        trip.setTripEndTime(new Timestamp(System.currentTimeMillis()));
        driverJourney.end(trip);
        riderJourney.end(trip);
        onEnd(trip);
    }
    protected abstract void onStart(Trip trip);
    protected abstract void onEnd(Trip trip);


}
