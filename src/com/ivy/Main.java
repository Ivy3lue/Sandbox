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
        String input = scanner.nextLine().trim();

        String trimmedInput = input.replaceAll("[^a-zA-Z0-9]", " ");
        String noDoubleSpaceInput = trimmedInput.replaceAll("( )+", " ");
        String[] words = noDoubleSpaceInput.split(" ");

        int numberOdAnagrams = 0;
        for (String word : words) {
            boolean anagram = isAnagram(word);
            if (anagram) {
                numberOdAnagrams++;
            }
        }
        System.out.println("Entry has " + numberOdAnagrams + " anagrams");
    }

    private static boolean isAnagram(String word) {
        for (int index = 0; index < word.length() / 2; index++) {
            if (word.charAt(index) != word.charAt(word.length() - 1 - index)) {
                return false;
            }
        }
        return true;
    }
}