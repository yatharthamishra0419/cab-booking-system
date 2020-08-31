package sample.cablld.services.booking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sample.cablld.models.Booking.Booking;
import sample.cablld.models.Booking.BookingBuilder;
import sample.cablld.models.Booking.BookingKeeper;
import sample.cablld.models.Booking.BookingStatus;
import sample.cablld.models.Location;
import sample.cablld.models.driver.Driver;
import sample.cablld.models.rider.Rider;
import sample.cablld.services.driverjourney.DriverJourney;
import sample.cablld.services.location.EligibleDriverAlgo;
import sample.cablld.services.location.LocationAlgo;
import sample.cablld.services.location.MostEligibleFactory;
import sample.cablld.services.location.NearByDriverFactory;
import sample.cablld.services.riderjourney.RiderJourney;

import java.util.List;

@Service
public class BookingService {

    @Autowired
    private DriverJourney driverJourney;

    @Autowired
    private RiderJourney riderJourney;

    public Booking book(Rider rider, Location startLocation,Location endLocation){
        List<Driver> nearByDrivers = NearByDriverFactory.
                getNearByDrivers(LocationAlgo.STANDARD).getNearByDrivers(startLocation);
        Driver mostEligibleDriver =
                MostEligibleFactory.getMostEligibleDriver(EligibleDriverAlgo.STANDARD).getMostEligibleDriver(nearByDrivers);
        Booking booking = BookingBuilder.build(rider, mostEligibleDriver, startLocation, endLocation);
        BookingKeeper.registerBooking(booking);
        driverJourney.onBooked(mostEligibleDriver);
        riderJourney.onBooked(rider);
        return booking;
     }

    public void cancel(Booking booking){
        booking.setBookingStatus(BookingStatus.CANCELLED);
        driverJourney.onBookingCacelled(booking.getDriver());
        riderJourney.onBookingCacelled(booking.getRider());
    }
}
