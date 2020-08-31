package sample.cablld.models.Booking;

import sample.cablld.models.Location;
import sample.cablld.models.driver.Driver;
import sample.cablld.models.rider.Rider;

import java.sql.Timestamp;

public class BookingBuilder {

    public static Booking build(Rider rider, Driver driver, Location startLocation,Location endLocation){
        Booking booking=new Booking();
        booking.setBookingTime(new Timestamp(System.currentTimeMillis()));
        booking.setDriver(driver);
        booking.setDriverLocation(driver.getDriverAvailabilty().getLastLocationTracked());
        booking.setRiderLocation(startLocation);
        booking.setDestinationLocation(endLocation);
        booking.setBookingStatus(BookingStatus.BOOKED);
        return booking;
    }
}
