package sample.cablld.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class ApplicationBootStrap {

    @Autowired
    private QueueChangesListner queueChangesListner;

    @PostConstruct
    public void init(){

        queueChangesListner.bindListner();
    }
}
