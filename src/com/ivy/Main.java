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

        for (int counter = 0; counter <= number; counter++) {
            System.out.println(counter);
        }
    }
}