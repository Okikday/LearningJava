package Lecture3Exercises;

import java.util.Scanner;
import java.io.PrintStream;

public class BMICalculator {
    public static void main(String[] args) {
        final PrintStream io = System.out;
        Scanner scanner = new Scanner(System.in);
        io.print("Enter your weight(kg): ");
        double weight = scanner.nextDouble();
        io.print("Enter your height(m):  ");
        double height = scanner.nextDouble();

        double bmi = weight / (height * height);

        if (bmi <= 18.5) {
            io.println("Underweight");
        }
        else if (bmi <= 25.0){
            io.println("Normal");
        }
        else if (bmi <= 30.0){
            io.println("Overweight");
        }
        else
            io.println("Obese");

        scanner.close();
    }
}