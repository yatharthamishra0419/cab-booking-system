package sample.cablld.models.location;

import org.springframework.stereotype.Service;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

@Service
public class LocationEventQueue {

    private Queue<QueueObject> driverLocationEventQueue=new LinkedBlockingDeque<>();

    public void addItemsToQueue(QueueObject queueObject){
        driverLocationEventQueue.add(queueObject);
    }

    public QueueObject readFromQueue(){
        return driverLocationEventQueue.poll();
    }
}
