package com.ivy;

import java.util.Scanner;

public class Main {
    /**
     * This is Java's main method
     * <br>
     * It always looks like this and each program must have one!
     *
     * @param args the arguments passed to the program
     */
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter the first number: ");
        int firstNumber = scanner.nextInt();

        System.out.printf("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        float quotient = quotient(firstNumber, secondNumber);
        System.out.printf("The quotient is: %.2f", quotient);
    }

    private static float quotient(int firstNumber, int secondNumber) {
        return (float) firstNumber / (float) secondNumber;
    }
}

