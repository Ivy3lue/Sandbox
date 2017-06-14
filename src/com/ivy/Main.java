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

        System.out.printf("Enter a three digit number: ");
        int threeDigitNumber = scanner.nextInt();

        if (threeDigitNumber < 100) {
            System.out.println("The number is too small");
        } else if (threeDigitNumber < 1000) {
            System.out.println("The number is OK");
        } else
            System.out.println("The number is too big");
    }
}

