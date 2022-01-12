package ru.job4j.chess.firuges;

import ru.job4j.chess.ImpossibleMoveException;

public interface Figure {
    Cell position();

    Object way(Cell dest) throws ImpossibleMoveException;

    default String icon() {
        return String.format(
                "%s.png", getClass().getSimpleName()
        );
    }

    Figure copy(Cell dest);
}
