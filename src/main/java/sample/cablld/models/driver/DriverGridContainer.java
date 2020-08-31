package sample.cablld.models.driver;

import sample.cablld.models.Grid;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class DriverGridContainer {

    private static Map<Grid, List<Driver>> driverByGrid=new ConcurrentHashMap<Grid, List<Driver>>();

    public static void changeDriverGrid(Driver driver,Grid newGrid){
        Grid grid = driver.getDriverAvailabilty().getLastLocationTracked().getGrid();
        List<Driver> drivers = driverByGrid.get(grid);
        Iterator<Driver> iterator=drivers.iterator();
        while (iterator.hasNext()){
            Driver driver1 = iterator.next();
            if(driver.equals(driver1))
                iterator.remove();
        }

    }
    public static void addDriverInGrid(Driver driver,Grid grid){
        if(driverByGrid.get(driver)==null)
            driverByGrid.put(grid,new LinkedList<>());
        driverByGrid.get(grid).add(driver);
    }

    public static  List<Driver> getDriverByGrid(Grid grid) {
        return driverByGrid.get(grid);
    }

    public static void setDriverByGrid(Map<Grid, List<Driver>> driverByGrid) {
        driverByGrid = driverByGrid;
    }
}
