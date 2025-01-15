package Lecture3Exercises;

import java.io.PrintStream;
import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args){
        final PrintStream io = System.out;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a year in form of int: ");
        int year = scanner.nextInt();

        switch (year % 12){
            case 0: io.println("monkey"); break;
            case 1: io.println("rooster"); break;
            case 2: io.println("dog"); break;
            case 3: io.println("pig"); break;
            case 4: io.println("rat"); break;
            case 5: io.println("ox"); break;
            case 6: io.println("tiger"); break;
            case 7: io.println("rabbit"); break;
            case 8: io.println("dragon"); break;
            case 9: io.println("snake"); break;
            case 10: io.println("horse"); break;
            case 11: io.println("sheep"); break;
            default: io.println("Unable to find year");
        }

        scanner.close();
    }
}
