package sample.cablld.services;

import sample.cablld.models.location.LocationEventQueue;
import sample.cablld.models.location.QueueObject;
import sample.cablld.services.driverjourney.DriverJourney;

public class LocationChangeEventTask implements Runnable {

    private LocationEventQueue locationEventQueue;
    private DriverJourney driverJourney;

    public LocationChangeEventTask(LocationEventQueue locationEventQueue, DriverJourney driverJourney){
            this.locationEventQueue=locationEventQueue;
            this.driverJourney=driverJourney;
    }

    @Override
    public void run() {
        while (true) {
            QueueObject queueObject = locationEventQueue.readFromQueue();
            if(queueObject==null)
                continue;
            driverJourney.onLocationChange(queueObject.getDriver(), queueObject.getCurrentLocation());
        }
     }
}
