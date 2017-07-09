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
        System.out.println("Please enter your text:");
        String input = scanner.nextLine();

        String trimmedInput = input.replaceAll("[^a-zA-Z0-9]", " ");
        String noDoubleSpaceInput = trimmedInput.replaceAll("( )+", " ");
        String[] words = noDoubleSpaceInput.split(" ");

        System.out.println("Number of words: " + words.length);
    }
}