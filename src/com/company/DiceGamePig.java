package com.company;
//Create a program that will randomly select two numbers from 1-6 (like rolling two dice). Show the dice rolls. You should also show the running score.
//Prompt the user to either roll again or lose their turn.
//A player scores the sum of the two dice thrown and gradually reaches a higher score as they continue to roll.
// If a single number 1 is thrown on either die, the score for that whole turn is lost. However a double 1 counts as 25.
//When you reach a score of 100 (or more) the game ends.

import java.util.Random;
import java.util.Scanner;

public class DiceGamePig {

    public static void main(String[] args) {
        Random r = new Random();
        Scanner Keyboard = new Scanner(System.in);
        for (int i = 0; i < 100; i++) {

        int x = 1 + r.nextInt(6);
        int y = 1 + r.nextInt(6);
        System.out.println("Your dice rolls are " + x + " and " + y);

        int score = x + y;
        System.out.println("Your score = " + score);

        System.out.print("Roll again or lose your turn?");
        String roll = Keyboard.nextLine();

        if (roll.equals("no")){
            System.out.println("Game ends. Thank you for playing.");
            System.exit(0);
            }

        else if (roll.equals ("yes")){
            System.out.println("Roll again");
            }

            if (x == 1 && y == 1) {
                score = 25;
            }
            else if (x == 1 && y == 2) {
                score = 0;
            }
            else if (x == 1 && y == 3) {
                score = 0;
            }
            else if (x == 1 && y == 4) {
                score = 0;
            }
            else if (x == 1 && y == 5) {
                score = 0;
            }
            else if (x == 1 && y == 6) {
                score = 0;
            }
            else if (x == 2 && y == 1) {
                score = 0;
            }
            else if (x == 3 && y == 1) {
                score = 0;
            }
            else if (x == 4 && y == 1) {
                score = 0;
            }
            else if (x == 5 && y == 1) {
                score = 0;
            }
            else if (x == 6 && y == 1) {
                score = 0;
            }
            else if (score >= 100) {
                System.out.println("Game Ends. Thank you for playing.");
                System.exit(0);
            }

        }
    }
}
