package sample.cablld.services.riderjourney;

import org.springframework.stereotype.Service;
import sample.cablld.models.Location;
import sample.cablld.models.rider.Rider;

@Service
public class RiderJourney extends RiderEngine {
    public void onTripStart(Rider rider) {
        System.out.println("rider journey started");
    }

    public void onTripEnd(Rider rider) {
        System.out.println("rider journey ended");
    }

    @Override
    public void onBooked(Rider rider) {

    }

    @Override
    public void onBookingCacelled(Rider rider) {

    }

    @Override
    public void onLocationChange(Rider rider, Location location) {

    }
}
