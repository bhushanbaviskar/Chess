package com.board.chess;

public class Board {
    private static int maxHorizontal = 8;
    private static int maxVertical = 8;

    public static boolean isValidMove(Position move) {
        return move.getX() >= 0 && move.getY() >= 0 && move.getX() < maxHorizontal && move.getY() < maxVertical;
    }
}
