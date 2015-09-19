//A grid has a two dimensional orthogonal grid of cells which it can display
package com.thoughtworks.baseline;

import java.util.ArrayList;

public class Grid {

    private Cell cell;

    public Grid(Cell cell) {
        this.cell = cell;
    }

    @Override
    public String toString() {
        return "X";
    }
}
