//A grid has a two dimensional orthogonal grid of cells which it can display
package com.thoughtworks.baseline;

import java.util.ArrayList;

public class Grid {

    private ArrayList<Cell> cells;

    public Grid(ArrayList<Cell> cells) {
        this.cells = cells;
    }

    @Override
    public String toString() {
        String grid = "";
        for(Cell cell : cells) {
            grid += cell.toString();
        }
        return grid;
    }
}
