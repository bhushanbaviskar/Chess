package com.board.chess.movement;

import com.board.chess.Position;

public interface Movement {
    Position move(Position current);
}
