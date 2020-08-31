package sample.cablld;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import sample.cablld.models.Booking.Booking;
import sample.cablld.models.Grid;
import sample.cablld.models.Location;
import sample.cablld.models.driver.DriverKeeper;
import sample.cablld.models.location.LocationEventQueue;
import sample.cablld.models.location.QueueObject;
import sample.cablld.models.rider.RiderKeeper;
import sample.cablld.models.trips.Trip;
import sample.cablld.models.trips.Tripkeeper;
import sample.cablld.services.ApplicationBootStrap;
import sample.cablld.services.GridService;
import sample.cablld.services.QueueChangesListner;
import sample.cablld.services.booking.BookingService;
import sample.cablld.services.driverjourney.DriverJourney;
import sample.cablld.services.journey.Journey;
import sample.cablld.services.registrations.DriverRegisterService;
import sample.cablld.services.registrations.RiderRegisterService;
import sample.cablld.services.riderjourney.RiderJourney;
import sample.cablld.services.trip.TripService;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {Journey.class, DriverJourney.class, RiderJourney.class,
        TripService.class,
        BookingService.class,RiderRegisterService.class,DriverRegisterService.class,GridService.class
, LocationEventQueue.class, QueueChangesListner.class, ApplicationBootStrap.class})
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

    @Autowired
    private LocationEventQueue locationEventQueue;

    @Test
    public void testDriverRegister(){
        Location location=new Location(1.0,1.0,gridService.getGrid(1.0,1.0));
        driverRegisterService.register("yathartha","yatharthamishra0419@gmail.com","8447666213",location);
        Assert.assertNotNull(DriverKeeper.find("yatharthamishra0419@gmail.com"));
    }


    @Test
    public void testRiderRegister(){
        Location location=new Location(1.0,1.0,gridService.getGrid(1.0,1.0));
        riderRegisterService.register("yathartha","anshu@abc.com","8447662134");
        Assert.assertNotNull(RiderKeeper.find("anshu@abc.com"));
    }

    @Test
    public void testTrip() throws InterruptedException {
        Location driverLocation=new Location(1.0,1.0,gridService.getGrid(1.0,1.0));
        driverRegisterService.register("yathartha","yatharthamishra0419@gmail.com","8447666213",driverLocation);
        riderRegisterService.register("yathartha","anshu@abc.com","8447662134");
        Location riderStartLocation=new Location(1.0,2.0,gridService.getGrid(1.0,1.0));
        Location riderEndLocation=new Location(2.0,3.0,gridService.getGrid(1.0,1.0));
        Booking booking = bookingService.book(RiderKeeper.find("anshu@abc.com"), riderStartLocation, riderEndLocation);
        Trip trip = tripService.startTrip(booking, riderStartLocation);
        locationEventQueue.addItemsToQueue(new QueueObject(DriverKeeper.find("yatharthamishra0419@gmail.com"),
                new Location(2.0,2.0,new Grid(1))));
        Thread.sleep(1000);
        tripService.endTrip(trip);
        System.out.println(Tripkeeper.getTripData(RiderKeeper.find("anshu@abc.com")));

    }

    @Test
    public void testDriverMovement(){

    }
}
