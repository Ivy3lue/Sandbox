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
        while (true) {
            System.out.printf("Enter a number: ");
            int number = scanner.nextInt();
            if (number == 0) {
                System.out.println("Thank you for your time");
                break;
            }
        }
    }
}