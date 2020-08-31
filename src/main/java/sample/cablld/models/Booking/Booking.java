package sample.cablld.models.Booking;

import sample.cablld.models.Location;
import sample.cablld.models.driver.Driver;
import sample.cablld.models.rider.Rider;

import java.sql.Timestamp;

public class Booking {

    Driver driver;
    Rider rider;
    private Timestamp bookingTime;
    private BookingAlgorithm bookingAlgorithm;
    private Location riderLocation;
    private Location driverLocation;
    private Location destinationLocation;
    private BookingStatus bookingStatus;

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Rider getRider() {
        return rider;
    }

    public void setRider(Rider rider) {
        this.rider = rider;
    }

    public Timestamp getBookingTime() {
        return bookingTime;
    }

    public void setBookingTime(Timestamp bookingTime) {
        this.bookingTime = bookingTime;
    }

    public BookingAlgorithm getBookingAlgorithm() {
        return bookingAlgorithm;
    }

    public void setBookingAlgorithm(BookingAlgorithm bookingAlgorithm) {
        this.bookingAlgorithm = bookingAlgorithm;
    }

    public Location getRiderLocation() {
        return riderLocation;
    }

    public void setRiderLocation(Location riderLocation) {
        this.riderLocation = riderLocation;
    }

    public Location getDriverLocation() {
        return driverLocation;
    }

    public void setDriverLocation(Location driverLocation) {
        this.driverLocation = driverLocation;
    }

    public Location getDestinationLocation() {
        return destinationLocation;
    }

    public void setDestinationLocation(Location destinationLocation) {
        this.destinationLocation = destinationLocation;
    }

    public BookingStatus getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(BookingStatus bookingStatus) {
        this.bookingStatus = bookingStatus;
    }
}
