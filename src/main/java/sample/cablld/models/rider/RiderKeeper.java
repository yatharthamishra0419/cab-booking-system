package sample.cablld.models.rider;

import java.util.LinkedList;
import java.util.List;

public class RiderKeeper {

    private static List<Rider> riders=new LinkedList<Rider>();

    public static void addRider(Rider rider){
        riders.add(rider);
    }

    public static Rider find(String email){
        return riders.stream().filter(rider -> rider.getEmail().equals(email)).findFirst().get();
    }
}
