package com.thoughtworks.baseline;

import org.junit.Test;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GridTest {

    @Test
    public void shouldReturnTheStringOfItsStateWithOnlyOneAliveCell() {
        Cell cell = mock(Cell.class);
        ArrayList<Cell> cells = new ArrayList<Cell>(Arrays.asList(cell));
        Grid grid = new Grid(cells);

        when(cell.stateOfCell()).thenReturn(true);

        assertEquals("X", grid.toString());
    }

    @Test
    public void shouldReturnTheStringIfItsStateWithOneRowOfCells() {
        Cell cell1 = mock(Cell.class);
        Cell cell2 = mock(Cell.class);
        Cell cell3 = mock(Cell.class);
        ArrayList<Cell> cells = new ArrayList<Cell>(Arrays.asList(cell1, cell2, cell3));
        Grid grid = new Grid(cells);

        when(cell1.toString()).thenReturn("X");
        when(cell2.toString()).thenReturn("-");
        when(cell3.toString()).thenReturn("X");

        assertEquals("X-X", grid.toString());
    }
}
