package com.cta.learning.rps;
import java.util.Scanner;
public class UserMove extends Move implements UserMoveInterface{
    private final Scanner user_input = new Scanner(System.in);
    public void displayOptions(){
        System.out.println("Please choose from one of the following:");
        for (String vm : validMoves) {
            System.out.println("-----> " + vm);
        }
    }
    public String makeMove(){
        displayOptions();
        this.move = user_input.nextLine();
        while (!isValidMove(this.move)) {
            System.out.println("That was not a valid choice!");
            System.out.println("Try again!");
            displayOptions();
            this.move = user_input.nextLine();
        }
        return this.move;
    }
}
