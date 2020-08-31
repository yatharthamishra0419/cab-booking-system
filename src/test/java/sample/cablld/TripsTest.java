package sample.cablld;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import sample.cablld.models.Booking.Booking;
import sample.cablld.models.Location;
import sample.cablld.services.GridService;
import sample.cablld.services.booking.BookingService;
import sample.cablld.services.registrations.DriverRegisterService;
import sample.cablld.services.registrations.RiderRegisterService;
import sample.cablld.services.trip.TripService;

@RunWith(SpringRunner.class)
@ContextConfiguration
public class TripsTest {

    @Autowired
    public TripService tripService;

    @Autowired
    public BookingService bookingService;

    @Autowired
    public RiderRegisterService riderRegisterService;

    @Autowired
    public DriverRegisterService driverRegisterService;

    @Autowired
    public GridService gridService;


    @Test
    public void testDriverRegister(){
        Location location=new Location(1.0,1.0,gridService.getGrid(1.0,1.0));
        driverRegisterService.register("yathartha","yatharthamishra0419@gmail.com","8447666213",location);

    }


    @Test
    public void testBookingSuccessFull(){

    }
}
