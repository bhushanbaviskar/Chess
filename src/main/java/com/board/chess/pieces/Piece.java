package com.board.chess.pieces;

import com.board.chess.Position;

import java.util.List;

public interface Piece {
    List<Position> possibleMoves();
}
