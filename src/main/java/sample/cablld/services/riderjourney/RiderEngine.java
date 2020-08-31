package sample.cablld.services.riderjourney;

import sample.cablld.models.rider.Rider;
import sample.cablld.models.rider.RiderState;
import sample.cablld.models.trips.Trip;

public abstract class RiderEngine implements IRiderEngine {

    public void start(Trip trip) {
        Rider rider = trip.getBooking().getRider();
        rider.setRiderState(RiderState.RIDE_STARTED);
        onTripStart(rider);
    }

    public void end(Trip trip){
        Rider rider = trip.getBooking().getRider();
        rider.setRiderState(RiderState.FREE);
        rider.setTotalNumberOfRides(rider.getTotalNumberOfRides()+1);
        onTripEnd(rider);

    }
}
