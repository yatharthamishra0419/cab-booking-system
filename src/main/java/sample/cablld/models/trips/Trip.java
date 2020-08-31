package sample.cablld.models.trips;

import sample.cablld.models.Booking.Booking;
import sample.cablld.models.Location;
import sample.cablld.models.driver.Driver;
import sample.cablld.models.rider.Rider;

import java.sql.Timestamp;

public class Trip {
    Location startLocation;
    Location endLocation;
    private Timestamp tripStartTime;
    private Timestamp tripEndTime;
    private Booking booking;

    public Location getStartLocation() {
        return startLocation;
    }

    public void setStartLocation(Location startLocation) {
        this.startLocation = startLocation;
    }

    public Location getEndLocation() {
        return endLocation;
    }

    public void setEndLocation(Location endLocation) {
        this.endLocation = endLocation;
    }

    public Timestamp getTripStartTime() {
        return tripStartTime;
    }

    public void setTripStartTime(Timestamp tripStartTime) {
        this.tripStartTime = tripStartTime;
    }

    public Timestamp getTripEndTime() {
        return tripEndTime;
    }

    public void setTripEndTime(Timestamp tripEndTime) {
        this.tripEndTime = tripEndTime;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }
}
