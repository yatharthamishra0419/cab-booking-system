package sample.cablld.services.location;

public class MostEligibleFactory {

    public static synchronized IMostEligibleDriver getMostEligibleDriver(EligibleDriverAlgo eligibleDriverAlgo){
        switch (eligibleDriverAlgo){
            case STANDARD:
                return drivers -> (drivers.get(0));

        }
        return null;
    }
}
