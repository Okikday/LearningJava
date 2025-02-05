package Lecture5Exercises;

import java.io.PrintStream;
import java.util.Scanner;

public class GetHighestScoreName {

    public static void main(String[] args) {
        // init
        Scanner scanner = new Scanner(System.in);
        final PrintStream io = System.out;

        // declare and init variables
        String studentName = null;
        int lowestScore = 0;
        int count = 0;

        // Loop indefinitely until sentinel matches
        while (true) {
            io.print("Enter student's name (or type 'exit' to end program): ");
            String name = scanner.nextLine();

            if (name.equalsIgnoreCase("exit"))
                break;

            io.print("Enter score for " + name + ": ");
            int score = scanner.nextInt();
            scanner.nextLine();

            if (score < lowestScore || count == 0) {
                lowestScore = score;
                studentName = name;
                count++;
            }
        }

        // Output the result
        if (studentName != null) {
            io.println("Student with the lowest score:");
            io.println("Name: " + studentName + ", Score: " + lowestScore);
        } else {
            io.println("No student name was entered");
        }
        scanner.close();
    }
}
