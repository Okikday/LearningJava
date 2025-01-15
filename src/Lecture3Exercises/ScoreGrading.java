package Lecture3Exercises;

import java.io.PrintStream;
import java.util.Scanner;

public class ScoreGrading {
    public static void main(String[] args){
        final PrintStream io = System.out;
        Scanner scanner = new Scanner(System.in);
        io.print("Enter score: ");
        double score = scanner.nextInt();
        scanner.close();
        if(score > 100.0 || score < 0.0){
            io.println("Score should be greater than 0 and less than 100");
            System.exit(0);
        }

        char grade;
        if(score >= 70.0){
            grade = 'A';
        }else if(score >= 60.0){
            grade = 'B';
        }else if(score >= 50.0){
            grade = 'C';
        }else if(score >= 40.0){
            grade = 'D';
        }else if(score >= 30.0){
            grade = 'E';
        }else{
            grade = 'F';
        }
        io.printf("Grade for %.2f is %.1s", score, grade);

    }
}
