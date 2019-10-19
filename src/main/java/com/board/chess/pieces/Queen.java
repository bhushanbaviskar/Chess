package com.board.chess.pieces;

import com.board.chess.Position;
import com.board.chess.movement.*;

import java.util.ArrayList;
import java.util.List;

public class Queen implements Piece {

    private List<Movement> movements;
    private Position current;

    Queen(Position current) {
        this.current = current;
        movements = new ArrayList<>();
        movements.add(new MoveUp());
        movements.add(new MoveDown());
        movements.add(new MoveLeft());
        movements.add(new MoveRight());
        movements.add(new MoveLeftDiagonalDown());
        movements.add(new MoveLeftDiagonalUp());
        movements.add(new MoveRightDiagonalDown());
        movements.add(new MoveRightDiagonalUp());
    }

    @Override
    public List<Position> possibleMoves() {
        List<Position> nextMoves = new ArrayList<>();
        Position prevPosition;
        for (Movement direction : movements) {
            prevPosition = current;
            Position nextPosition = direction.move(prevPosition);
            while (!nextPosition.equals(prevPosition)) {
                prevPosition = nextPosition;
                nextMoves.add(nextPosition);
                nextPosition = direction.move(nextPosition);
            }
        }
        return nextMoves;
    }
}
