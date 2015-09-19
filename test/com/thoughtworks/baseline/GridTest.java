package com.thoughtworks.baseline;

import org.junit.Test;

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
        ArrayList<ArrayList<Cell>> gridOfCells = new ArrayList<ArrayList<Cell>>(Arrays.asList(cells));
        Grid grid = new Grid(gridOfCells);

        when(cell.toString()).thenReturn("X");

        assertEquals("X\n", grid.toString());
    }

    @Test
    public void shouldReturnTheStringIfItsStateWithOneRowOfCells() {
        Cell cell1 = mock(Cell.class);
        Cell cell2 = mock(Cell.class);
        Cell cell3 = mock(Cell.class);
        ArrayList<Cell> cells = new ArrayList<Cell>(Arrays.asList(cell1, cell2, cell3));
        ArrayList<ArrayList<Cell>> gridOfCells = new ArrayList<ArrayList<Cell>>(Arrays.asList(cells));
        Grid grid = new Grid(gridOfCells);

        when(cell1.toString()).thenReturn("X");
        when(cell2.toString()).thenReturn("-");
        when(cell3.toString()).thenReturn("X");

        assertEquals("X-X\n", grid.toString());
    }

    @Test
    public void shouldReturnTheStringIfItsStateWithMultipleRowsOfCells() {
        Cell cell1 = mock(Cell.class);
        Cell cell2 = mock(Cell.class);
        Cell cell3 = mock(Cell.class);
        Cell cell4 = mock(Cell.class);
        ArrayList<Cell> firstRowOfCells = new ArrayList<Cell>(Arrays.asList(cell1, cell2));
        ArrayList<Cell> secondRowOfCells = new ArrayList<Cell>(Arrays.asList(cell3, cell4));
        ArrayList<ArrayList<Cell>> gridOfCells = new ArrayList<ArrayList<Cell>>(Arrays.asList(firstRowOfCells, secondRowOfCells));
        Grid grid = new Grid(gridOfCells);

        when(cell1.toString()).thenReturn("X");
        when(cell2.toString()).thenReturn("X");
        when(cell3.toString()).thenReturn("X");
        when(cell4.toString()).thenReturn("X");

        assertEquals("XX\nXX\n", grid.toString());
    }
}
