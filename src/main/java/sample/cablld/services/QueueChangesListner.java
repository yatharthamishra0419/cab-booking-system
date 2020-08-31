package sample.cablld.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sample.cablld.models.location.LocationEventQueue;
import sample.cablld.services.driverjourney.DriverJourney;

import javax.annotation.PostConstruct;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@Service
public class QueueChangesListner {

    private ExecutorService executorService;

    @Autowired
    private LocationEventQueue locationEventQueue;

    @Autowired
    private DriverJourney driverJourney;

    @PostConstruct
    public void init(){
         executorService= new ThreadPoolExecutor(15, 100,
                5l, TimeUnit.SECONDS, new LinkedBlockingDeque<>(100));
    }

    public void bindListner(){
      executorService.submit(new LocationChangeEventTask(locationEventQueue,driverJourney));
    }
}
