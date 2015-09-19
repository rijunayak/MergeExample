package com.thoughtworks.baseline;

/**
 * Created by rijun on 9/19/15.
 */
public class Cell {

    private boolean state;

    public Cell(boolean state) {
        this.state = state;
    }

    public boolean stateOfCell() {
        return state;
    }
}
