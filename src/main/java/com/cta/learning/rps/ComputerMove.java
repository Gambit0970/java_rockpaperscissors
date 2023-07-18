package com.cta.learning.rps;

import java.util.concurrent.ThreadLocalRandom;
public class ComputerMove extends Move implements ComputerMoveInterface {
    public String makeMove(){
        int minR = 0;
        int maxR = getValidMovesLength();
        this.move=getMove(ThreadLocalRandom.current().nextInt(minR, maxR));
        return this.move;
    }
}