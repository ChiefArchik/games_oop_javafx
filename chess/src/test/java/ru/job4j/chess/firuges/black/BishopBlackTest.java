package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class BishopBlackTest {

    @Test
    public void testPosition() {
        BishopBlack bishop = new BishopBlack(Cell.E4);
        assertThat(bishop.position(),
                is(Cell.E4));
    }

    @Test
    public void testCopy() {
        BishopBlack bishop = new BishopBlack(Cell.C2);
        assertThat(bishop.copy(Cell.F8).position(), is(Cell.F8));
    }

    @Test
    public void testWay() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        assertThat(bishopBlack.way(Cell.G5), is(new Cell[] {Cell.D2, Cell.E3, Cell.F4, Cell.G5}));
    }
}