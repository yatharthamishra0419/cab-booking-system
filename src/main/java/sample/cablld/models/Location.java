package sample.cablld.models;

public class Location {

    private double x;
    private double y;
    Grid grid;

    public Location() {
    }

    public Location(double x, double y, Grid grid) {
        this.x = x;
        this.y = y;
        this.grid = grid;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Grid getGrid() {
        return grid;
    }

    public void setGrid(Grid grid) {
        this.grid = grid;
    }

    @Override
    public String toString() {
        return "Location{" +
                "x=" + x +
                ", y=" + y +
                ", grid=" + grid +
                '}';
    }
}
