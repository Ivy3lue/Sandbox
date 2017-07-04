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
            for (int column = 0; column < order; column++) {
                if (row % 2 == 0) {
                    if (column % 2 == 1) {
                        System.out.print("X ");
                    } else {
                        System.out.print("0 ");
                    }
                }
                if (row % 2 == 1) {
                    if (column % 2 == 0) {
                        System.out.print("X ");
                    } else {
                        System.out.print("0 ");
                    }
                }
            }
            System.out.println();
        }
    }
}