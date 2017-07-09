package com.ivy;

import java.util.*;

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
        System.out.println("Please enter the coefficients for the square equation: ax^2 + bx + c = 0 ");
        System.out.printf("Enter value a: ");
        double a = scanner.nextDouble();
        System.out.printf("Enter value b: ");
        double b = scanner.nextDouble();
        System.out.printf("Enter Value c: ");
        double c = scanner.nextDouble();

        double d = (Math.pow(b, 2) - (4 * a * c));

        if (d < 0) {
            System.out.println("The equation has no solution");
        } else {
            double x1 = (b + Math.sqrt(d)) / (2 * a);
            double x2 = (-(b) + Math.sqrt(d)) / (2 * a);
            if (d == 0) {
                System.out.printf("x= %.2f", x1);
            } else {
                System.out.printf("x1 = %.2f; x2 = %.2f", x1, x2);
            }
        }
    }
}