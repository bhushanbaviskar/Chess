package com.board.chess.pieces;

import com.board.chess.Position;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class QueenTest {

    @Test
    void withAnEmptyBoardGivenCurrentPositionAsOriginShouldReturnNextMoves() {
        Piece queen = new Queen(new Position(0, 0));
        List<Position> nextMoves = queen.possibleMoves();
        assertNotNull(nextMoves);
        assertEquals(21, nextMoves.size());
    }
}