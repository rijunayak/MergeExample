package com.thoughtworks.baseline;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CellTest {

    @Test
    public void shouldHaveAnAliveState() {
        Cell cell = new Cell(true);

        assertEquals(true, cell.stateOfCell());
    }

    @Test
    public void shouldHaveADeadState() {
        Cell cell = new Cell(false);

        assertEquals(false, cell.stateOfCell());
    }

    @Test
    public void shouldShowXIfAlive() {
        Cell cell = new Cell(true);

        assertEquals("X", cell.toString());
    }
}
