package sample.cablld.services.registrations;

import org.springframework.stereotype.Service;
import sample.cablld.models.rider.Rider;
import sample.cablld.models.rider.RiderKeeper;

@Service
public class RiderRegisterService {

    public void register(String name, String email, String mobileNumber){
        Rider rider=new Rider();
        rider.setEmail(email);
        rider.setMobileNumber(mobileNumber);
        rider.setName(name);
        RiderKeeper.addRider(rider);
    }

}
