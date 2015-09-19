// A Cell has a dead or alive state and a string to indicate the same
package com.thoughtworks.baseline;

public class Cell {

    private boolean state;

    public Cell(boolean state) {
        this.state = state;
    }

    public boolean stateOfCell() {
        return state;
    }

    @Override
    public String toString() {
        return state ? "X" : "-";
    }
}
