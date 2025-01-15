package exampleCodes;

import java.util.Scanner;

class CalculateGCD {
    public static void main(String [] args){
        System.out.println("Input two numbers to calculate their greatest common divisor.");
        Scanner input = new Scanner(System.in);

        System.out.print("\nInput first number: ");
        final int num1 = input.nextInt();
        System.out.print("\nInput second number: ");
        final int num2 = input.nextInt();

        final int gcdForTwoNumbers = calcGCD(num1, num2);

        System.out.printf("\nThe Greatest common divisor for %d and %d is %d", num1, num2, gcdForTwoNumbers);
    }

    static int calcGCD(int n1, int n2){
        if(n1 < 2 || n2 < 2) return 0;
        int gcd = 1; // Initial gcd is 1
        int k = 2; // Possible gcd
        while (k <= n1 && k <= n2) {
            if (n1 % k == 0 && n2 % k == 0){
                gcd = k; // Update gcd
            }
            k++; // Next possible gcd
        }
        return gcd;
    }
}