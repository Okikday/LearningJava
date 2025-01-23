package Lecture4Exercises;
import java.util.Scanner;
import java.io.PrintStream;

public class AdditionQuiz {
    public static void main(String[] args){
        final PrintStream io = System.out;
        Scanner input = new Scanner(System.in);

        final int num1 = (int)(Math.random() * 10);
        final int num2 = (int)(Math.random() * 10);

        final int result = num1 + num2;

        while (true){
            io.print("What is " + num1 + " + " + num2 + "? ");
            int userInput = input.nextInt();
            if(userInput == result){
                io.println("Your answer is correct!");
                break;
            }else{
                io.println("Wrong. Try again!");
            }
        }

        input.close();

    }
}
