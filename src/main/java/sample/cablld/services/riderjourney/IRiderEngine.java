package sample.cablld.services.riderjourney;

import sample.cablld.models.Location;
import sample.cablld.models.rider.Rider;

public interface IRiderEngine {

    void onTripStart(Rider rider);
    void onTripEnd(Rider rider);
    void onBooked(Rider rider);
    void onBookingCacelled(Rider rider);
    void onLocationChange(Rider rider, Location location);
}
