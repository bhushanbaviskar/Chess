package com.board.chess.pieces;

import com.board.chess.Position;
import com.board.chess.movement.MoveUp;
import com.board.chess.movement.Movement;

import java.util.Collections;
import java.util.List;

import static java.util.Collections.emptyList;

public class Pawn implements Piece {

    private Movement movement;
    private Position current;

    public Pawn(Position current) {
        this.current = current;
        movement = new MoveUp();
    }

    public List<Position> possibleMoves() {
        if (current == null) return emptyList();
        Position nextMove = movement.move(current);
        if (nextMove.equals(current)) return emptyList();
        return Collections.singletonList(nextMove);
    }

}
