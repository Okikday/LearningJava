package Lecture2Exercises;

import java.io.PrintStream;
import java.util.Scanner;

// Converts time in seconds to the form (minutes and seconds)
public class Ex1DisplayingTime {
    public static void main(String [] args){
        final PrintStream io = System.out; // Alias System.out to reduce code length
        Scanner inputScanner = new Scanner(System.in); // Initializes instance to receive input
        io.println("PURPOSE:\n CONVERTS NUMBER IN SECONDS TO MINUTES AND SECONDS");
        io.print("PROMPT:\n Input a number in seconds: ");

        final int inputValueInSeconds = inputScanner.nextInt(); // Accept an int value
        inputScanner.close(); // close scanner after use

        io.println("OUTPUT:");
        if(inputValueInSeconds <= 0){
            io.println("Input a number greater than 0");
        }
        else {
            final int minutesPart = inputValueInSeconds / 60;
            final int secondsPart = inputValueInSeconds % 60;
            io.println(inputValueInSeconds + " is " + minutesPart + " minutes and " + secondsPart + " seconds");
        }
        return;
    }
}
