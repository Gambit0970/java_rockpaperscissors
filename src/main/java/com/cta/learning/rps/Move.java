package com.cta.learning.rps;

import java.util.Arrays;

public class Move implements MoveInterface {
    protected String move;
    protected String[] validMoves = {"Rock", "Paper", "Scissors"};

    @Override
    public boolean isValidMove(String move){
        return Arrays.asList(validMoves).contains(move);
    }
    @Override
    public int getIndex(String move){
        return Arrays.asList(validMoves).indexOf(move);
    }
    @Override
    public int getValidMovesLength(){
        return Arrays.asList(validMoves).size();
    }
    @Override
    public String getMove() {
        return this.move;
    }
    public String getMove(int i) {
        return validMoves[i];
    }
    @Override
    public void setMove(String move) {
        this.move = move;
    }
}
