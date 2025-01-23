package Lecture4Exercises;

import java.io.PrintStream;
import java.util.Scanner;

public class GuessingNumbers {
    public static void main(String[] args){
        final PrintStream io = System.out;
        Scanner input = new Scanner(System.in);

        final int randomNumber = (int)(Math.random() * 101);
        int tries = 0;
        while(true){
            io.print("Guess the random number: ");
            int userInput = input.nextInt(); tries++;
            if(userInput == randomNumber){
                io.println("You guess the number correct in " + tries + " tries.");
                break;
            }
            if(userInput < randomNumber){
                io.println("Input is too low");
            }else{
                io.println("Input is too high");
            }
        }

        input.close();
    }
}
