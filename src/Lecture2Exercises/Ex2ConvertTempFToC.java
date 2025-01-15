package Lecture2Exercises;

import java.io.PrintStream;
import java.util.Scanner;

// Convert Fahrenheit degree to Celsius
public class Ex2ConvertTempFToC {
    public static void main(String[] args){
        final PrintStream io = System.out; // Alias System.out to reduce code length
        Scanner inputScanner = new Scanner(System.in); // Initializes instance to receive input
        io.println("PURPOSE:\n CONVERT TEMPERATURE FROM FAHRENHEIT TO CELSIUS");
        io.print("PROMPT:\n Input a number in Fahrenheit: ");
        final double fahrenheit = inputScanner.nextDouble(); // Accept Fahrenheit input
        inputScanner.close();
        final double celsius = (5.0 / 9) * (fahrenheit - 32); // Initialize celsius variable
        io.printf("OUTPUT:\n %.2f in degrees celsius.", celsius); // Print output degree to two decimal places
    }
}
