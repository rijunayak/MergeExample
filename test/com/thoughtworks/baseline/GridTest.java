package com.thoughtworks.baseline;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockingDetails;
import static org.mockito.Mockito.when;

public class GridTest {

    @Test
    public void shouldReturnTheStringOfItsStateWithOnlyOneAliveCell() {
        Cell cell = mock(Cell.class);
        ArrayList<Cell> cells = new ArrayList<>(Arrays.asList(cell));
        ArrayList<ArrayList<Cell>> gridOfCells = new ArrayList<>(Arrays.asList(cells));
        Grid grid = new Grid(gridOfCells);

        when(cell.toString()).thenReturn("X");

        assertEquals("X\n", grid.toString());
    }

    @Test
    public void shouldReturnTheStringIfItsStateWithOneRowOfCells() {
        Cell cell1 = mock(Cell.class);
        Cell cell2 = mock(Cell.class);
        Cell cell3 = mock(Cell.class);
        ArrayList<Cell> cells = new ArrayList<>(Arrays.asList(cell1, cell2, cell3));
        ArrayList<ArrayList<Cell>> gridOfCells = new ArrayList<>(Arrays.asList(cells));
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
        ArrayList<Cell> firstRowOfCells = new ArrayList<>(Arrays.asList(cell1, cell2));
        ArrayList<Cell> secondRowOfCells = new ArrayList<>(Arrays.asList(cell3, cell4));
        ArrayList<ArrayList<Cell>> gridOfCells = new ArrayList<>(Arrays.asList(firstRowOfCells, secondRowOfCells));
        Grid grid = new Grid(gridOfCells);

        when(cell1.toString()).thenReturn("X");
        when(cell2.toString()).thenReturn("X");
        when(cell3.toString()).thenReturn("X");
        when(cell4.toString()).thenReturn("X");

        assertEquals("XX\nXX\n", grid.toString());
    }

    @Test
    public void shouldReturnADeadCellAsTheNextStateForASingleAliveCellInGrid() {
        Cell cell1 = mock(Cell.class);
        Cell cell2 = mock(Cell.class);
        ArrayList<Cell> cells = new ArrayList<>(Arrays.asList(cell1, cell2));
        ArrayList<ArrayList<Cell>> gridOfCells = new ArrayList<>(Arrays.asList(cells));
        Grid grid = new Grid(gridOfCells);

        when(cell1.stateOfCell()).thenReturn(false);
        when(cell2.stateOfCell()).thenReturn(true);

        assertEquals(false, grid.sameStateInNextStep(1, 2));
    }

    @Test
    public void shouldReturnAliveCellForTheMiddleCellInAGridWithThreeAliveCellsInARow() {
        Cell cell1 = mock(Cell.class);
        Cell cell2 = mock(Cell.class);
        Cell cell3 = mock(Cell.class);
        ArrayList<Cell> cells = new ArrayList<>(Arrays.asList(cell1, cell2, cell3));
        ArrayList<ArrayList<Cell>> gridOfCells = new ArrayList<>(Arrays.asList(cells));
        Grid grid = new Grid(gridOfCells);

        when(cell1.stateOfCell()).thenReturn(true);
        when(cell2.stateOfCell()).thenReturn(true);
        when(cell3.stateOfCell()).thenReturn(true);

        assertEquals(true, grid.sameStateInNextStep(1, 2));
    }

    @Test
    public void shouldReturnDeadCellForTheSecondCellInAGridWithTwoAliveCellsInARow() {
        Cell cell1 = mock(Cell.class);
        Cell cell2 = mock(Cell.class);
        Cell cell3 = mock(Cell.class);
        ArrayList<Cell> cells = new ArrayList<>(Arrays.asList(cell1, cell2, cell3));
        ArrayList<ArrayList<Cell>> gridOfCells = new ArrayList<>(Arrays.asList(cells));
        Grid grid = new Grid(gridOfCells);

        when(cell1.stateOfCell()).thenReturn(true);
        when(cell2.stateOfCell()).thenReturn(true);
        when(cell3.stateOfCell()).thenReturn(false);

        assertEquals(false, grid.sameStateInNextStep(1,2));
    }
}
