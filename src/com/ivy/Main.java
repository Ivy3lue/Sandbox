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
        List<Integer> list = readNumbers();
        if (list.isEmpty()) {
            System.out.printf("List is empty");
            return;
        }

        if (list.size() == 1) {
            System.out.println("The list contains only one number");
            return;
        }

        Integer maxNumber = findMaxNumber(list);
        list.remove(maxNumber);

        System.out.println("Second largest number in the list is " + findMaxNumber(list));
    }

    private static Integer findMaxNumber(List<Integer> list) {
        int maxNumber = 1;
        for (Integer number : list) {
            if (number > maxNumber) {
                maxNumber = number;
            }
        }
        return maxNumber;
    }

    private static List<Integer> readNumbers() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while (true) {
            System.out.printf("Enter a number (or 0 to end list): ");
            int number = scanner.nextInt();
            if (number == 0) {
                System.out.println("Thank you for your time");
                break;
            }
            list.add(number);
        }
        return list;
    }
}