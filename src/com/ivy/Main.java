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

        System.out.printf("Enter your first number: ");
        int firstNumber = scanner.nextInt();

        System.out.printf("Enter your second number: ");
        int secondNumber = scanner.nextInt();

        int sum = sum(firstNumber, secondNumber);
        System.out.printf("%d + %d = %d", firstNumber, secondNumber, sum);
    }

    private static int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
}

