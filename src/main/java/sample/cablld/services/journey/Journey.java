package sample.cablld.services.journey;

import org.springframework.stereotype.Service;
import sample.cablld.models.trips.Trip;

@Service
public class Journey extends TripEngine {

    protected void onStart(Trip trip) {
        System.out.println("trip started successfully");
    }

    protected void onEnd(Trip trip) {
        System.out.println("trip ended successfully");
    }
}
