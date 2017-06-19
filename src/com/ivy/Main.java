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

        System.out.printf("Insert number of order: ");
        int order = scanner.nextInt();

        for (int row = 0; row < order; row++) {
            for (int column = 0; column < order - row; column++) {
                System.out.print("O ");
            }
            System.out.println();
        }
        for (int row = 1; row < order; row++) {
            for (int column = 0; column <= row; column++) {
                System.out.print("O ");
            }
            System.out.println();
        }
    }
}