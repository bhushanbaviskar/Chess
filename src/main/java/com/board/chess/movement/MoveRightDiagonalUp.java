package com.board.chess.movement;

import com.board.chess.Board;
import com.board.chess.Position;

public class MoveRightDiagonalUp implements Movement {

    public Position move(Position current) {
        Position nextPosition = new Position(current.getX() + 1, current.getY() + 1);
        if (Board.isValidMove(nextPosition))
            return nextPosition;
        return current;
    }
}
