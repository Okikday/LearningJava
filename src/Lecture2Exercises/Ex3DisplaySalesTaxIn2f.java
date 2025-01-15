package Lecture2Exercises;

import java.io.PrintStream;
import java.util.Scanner;

public class Ex3DisplaySalesTaxIn2f {
    public static void main(String [] args){
        final PrintStream io = System.out; // Alias System.out to reduce code length
        Scanner inputScanner = new Scanner(System.in); // Initializes instance to receive input

        io.println("PURPOSE:\n CONVERT SALES TAX TO TWO DECIMAL POINTS");
        io.print("PROMPT:\n Input number: ");

        final double salesTax = inputScanner.nextDouble(); // Store input of salesTax as double
        inputScanner.close();

        io.printf("OUTPUT: %.2f", salesTax); // Print salesTax output to two decimal places

    }
}
