package sample.cablld.models;

import java.util.Objects;

public class Grid {

    int gridNumber;

    public Grid(int gridNumber) {
        this.gridNumber = gridNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Grid grid = (Grid) o;
        return gridNumber == grid.gridNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(gridNumber);
    }
}
