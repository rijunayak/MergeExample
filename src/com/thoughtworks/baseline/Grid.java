//A grid has a two dimensional orthogonal grid of cells which it can display and decide the next state for a cell
package com.thoughtworks.baseline;

import java.util.ArrayList;

public class Grid {

    private ArrayList<ArrayList<Cell>> gridOfCells;

    public Grid(ArrayList<ArrayList<Cell>> gridOfCells) {
        this.gridOfCells = gridOfCells;
    }

    @Override
    public String toString() {
        String grid = "";
        for(ArrayList<Cell> cells : gridOfCells) {
            for(Cell cell : cells) {
                grid += cell.toString();
            }
            grid += "\n";
        }
        return grid;
    }

    public boolean sameStateInNextStep(int i, int j) {
        if(gridOfCells.get(i - 1).get(j - 2).stateOfCell()) {
            return true;
        }
        return false;
    }
}
