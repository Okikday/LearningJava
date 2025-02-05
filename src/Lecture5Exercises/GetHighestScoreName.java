package Lecture5Exercises;

import java.util.Scanner;

// AUTHOR: GBELEYI OKIKIOLA
// MATRIC NO.: 230805057
// DEPARTMENT: COMPUTER SCIENCE
// PURPOSE: This program finds the name with the lowest score from multiple inputs

// Modified class name to match file name in java
public class GetHighestScoreName {

    public static void main(String[] args) {
        // Initialize the scanner for input
        Scanner scanner = new Scanner(System.in);
        final java.io.PrintStream io = System.out;  // Standard output stream

        io.println("Program to output the name with the lowest score from input using loops");

        // Declare and initialize variables for student name, lowest score, and entry count
        String studentName = null;  // Holds the name of the student with the lowest score
        int lowestScore = 0;        // Holds the lowest score
        int count = 0;              // Tracks the number of valid entries

        // Infinite loop to gather student name and score
        while (true) {
            // Prompt user for student name
            io.print("Enter student's name (or type 'exit' to end program): ");
            String name = scanner.nextLine();

            // Exit condition for the loop
            if (name.equalsIgnoreCase("exit"))
                break;

            // Prompt for and read student's score
            io.print("Enter score for " + name + ": ");
            int score = scanner.nextInt();
            scanner.nextLine(); // Consume the newline left by nextInt()

            // Update lowest score and corresponding student if condition is met
            if (score < lowestScore || count == 0) {
                lowestScore = score;
                studentName = name;
                count++;  // Increment count to indicate a valid entry was made
            }
        }

        // Display the result
        if (studentName != null) {
            io.println("Student with the lowest score:");
            io.println("Name: " + studentName + ", Score: " + lowestScore);
        } else {
            // Handle case where no student name was entered
            io.println("No student name was entered");
        }

        // Close the scanner to free resources
        scanner.close();
    }
}


// Program can also be verified at:
// https://github.com/Okikday/LearningJava/blob/master/src/Lecture5Exercises/GetHighestScoreName.java