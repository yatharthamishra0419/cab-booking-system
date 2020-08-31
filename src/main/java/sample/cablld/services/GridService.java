package sample.cablld.services;

import org.springframework.stereotype.Service;
import sample.cablld.models.Grid;

@Service
public class GridService {

    public Grid getGrid(double x,double y){
        return new Grid(1);
    }
}
