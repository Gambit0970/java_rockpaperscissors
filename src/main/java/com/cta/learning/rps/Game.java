package com.cta.learning.rps;

import java.util.Scanner;

public class Game implements GameInterface {
    protected static Scanner user_input = new Scanner(System.in);
    protected static boolean playAgain;
    protected static String winner;
    protected int computerScore = 0;
    protected int userScore = 0;
    protected Move move = new Move();
    protected String move1;
    protected String move2;
    public String nextGame(){
        ComputerMove cMove = new ComputerMove();
        UserMove uMove = new UserMove();
        setMoves(uMove.makeMove(),cMove.makeMove());
        System.out.println("Computer played " + cMove.getMove());
        System.out.println("You played " + uMove.getMove());
        int winner = checkWinner();
        if (winner == 0){
            return "Draw!";
        } else if (winner ==1){
            return "Player wins!";
        } else{
            return "Computer wins!";
        }
    }
    @Override
    public void playGame() {
        playAgain = true;
        while (playAgain){
            winner = nextGame();
            System.out.println(winner);
            if (!"Draw!".equals(winner)){
                System.out.println("Play again (y/n)?");
                playAgain = user_input.nextLine().equalsIgnoreCase("y");
                //playAgain = false;
            } else {
                System.out.println("... Going again!!!! ...");
            }
        }
        System.out.println("Computer won " + computerScore + " times!...");
        System.out.println("You won " + userScore + " times!...");
        if (userScore>computerScore){
            System.out.println("... You were the overall winner!");
        } else {
            System.out.println("... The computer was the overall winner!");
        }

    }
    private void setMoves(String move1, String move2) {
        this.move1=move1;
        this.move2=move2;
    }
    private int checkWinner() {
        int m1 = move.getIndex(this.move1);
        int m2 = move.getIndex(this.move2);
        int len = move.getValidMovesLength();
        if (m1==m2){
            return 0;
        }
        else if (m1==0 & m2==len){
            userScore++;
            return 1;
        }
        else if (m2==0 & m1==len){
            computerScore++;
            return 2;
        }
        else if (m1>m2){
            userScore++;
            return 1;
        }
        else {
            computerScore++;
            return 2;
        }
    }
}
