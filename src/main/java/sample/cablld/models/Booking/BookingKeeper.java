package sample.cablld.models.Booking;

import java.util.LinkedList;
import java.util.List;

public class BookingKeeper {

    private static List<Booking> bookings=new LinkedList<>();

    public static void registerBooking(Booking booking){
        bookings.add(booking);
    }
}
