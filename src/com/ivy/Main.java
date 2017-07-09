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
        System.out.println("Please enter your text ");
        String input = scanner.nextLine();

        Map<Character, Integer> map = new HashMap<>();
        for (Character character : input.toCharArray()) {
            if (!map.containsKey(character)) {
                map.put(character, 1);
            } else {
                map.put(character, map.get(character) + 1);
            }
        }
        System.out.println(Arrays.toString(map.entrySet().toArray()));
    }
}