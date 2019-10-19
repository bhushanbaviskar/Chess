package com.board.chess;

import com.board.chess.pieces.Pawn;
import com.board.chess.pieces.Piece;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PawnTest {

    @Test
    void withAnEmptyBoardGivenStartPositionOfPawnReturnNextPosition() {
        Piece pawn = new Pawn(new Position(2, 1));
        List<Position> moves = pawn.possibleMoves();
        assertNotNull(moves);
        assertEquals(1, moves.size());
        assertEquals(new Position(2, 2), moves.get(0));
    }

    @Test
    void withAnEmptyBoardGivenLastPositionOfPawnReturnEmptyList() {
        Piece pawn = new Pawn(new Position(7, 7));
        List<Position> moves = pawn.possibleMoves();
        assertNotNull(moves);
        assertTrue(moves.size() == 0);
    }
}