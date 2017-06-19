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

        System.out.printf("Enter a number: ");
        int number = scanner.nextInt();

        int invertedNumber = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            invertedNumber = invertedNumber * 10 + lastDigit;
            number /= 10;
        }
        System.out.println("The number inverted is: " + invertedNumber);
    }
}