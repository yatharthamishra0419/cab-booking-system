package sample.cablld.services.trip;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sample.cablld.models.Booking.Booking;
import sample.cablld.models.Location;
import sample.cablld.models.trips.Trip;
import sample.cablld.services.driverjourney.DriverJourney;
import sample.cablld.services.journey.Journey;
import sample.cablld.services.riderjourney.RiderJourney;

@Service
public class TripService {

    @Autowired
    private Journey journey;

    @Autowired
    private DriverJourney driverJourney;

    @Autowired
    private RiderJourney riderJourney;

    public Trip startTrip(Booking booking, Location location){
        return journey.start(booking,location,driverJourney,riderJourney);
    }

    public void endTrip(Trip trip){
        journey.end(trip,driverJourney,riderJourney);
    }

}
