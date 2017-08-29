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

        System.out.println("Enter your time table number: ");

        Scanner input = new Scanner(System.in);
        int order = input.nextInt();

        System.out.println("Here is the timetable for number " + order);
        System.out.println();

        for (int row = 1; row <= order; row++) {
            for (int column = 1; column <= order; column++) {
                System.out.print(getProduct(row, column) + " ");
            }
            System.out.println();
        }
    }

    private static Object getProduct(int firstOperand, int secondOperand) {
        return firstOperand * secondOperand;

    }
}

