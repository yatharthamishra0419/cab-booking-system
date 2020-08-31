package sample.cablld.services.journey;

import org.springframework.stereotype.Service;
import sample.cablld.models.trips.Trip;
import sample.cablld.models.trips.Tripkeeper;

@Service
public class Journey extends TripEngine {

    protected void onStart(Trip trip) {
        System.out.println("trip started successfully");
        Tripkeeper.addTrips(trip);
    }

    protected void onEnd(Trip trip) {

        System.out.println("trip ended successfully");

    }
}
