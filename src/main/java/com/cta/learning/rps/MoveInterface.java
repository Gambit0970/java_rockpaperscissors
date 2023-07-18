package com.cta.learning.rps;

public interface MoveInterface {
    boolean isValidMove(String move);
    int getIndex(String move);
    int getValidMovesLength();
    String getMove();
    void setMove(String move);
}
