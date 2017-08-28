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

        System.out.println("Please enter student's quiz score:");
        int quiz = scanner.nextInt();
        if (!validateInput(quiz)) {
            System.out.println("Please insert valid score, 0 - 100 points");
            return;
        }
        if (quiz < 50) {
            System.out.println("Student failed the exam");
            return;
        }

        System.out.println("Please enter student's midterm score:");
        int midterm = scanner.nextInt();
        if (!validateInput(midterm)) {
            System.out.println("Please insert valid score, 0 - 100 points");
            return;
        }
        if (midterm < 50) {
            System.out.println("Student failed the exam");
            return;
        }

        System.out.println("Please enter student's second semester score:");
        int secondSemester = scanner.nextInt();
        if (!validateInput(secondSemester)) {
            System.out.println("Please insert valid score, 0 - 100 points");
            return;
        }
        if (secondSemester < 50) {
            System.out.println("Student failed the exam");
            return;
        }

        int finalScore = calculateScore(quiz, midterm, secondSemester);
        String grade = getGrade(finalScore);
        System.out.println("Student's final score is: " + grade);
    }

    private static boolean validateInput(int score) {
        return !(score < 0 && score > 100);
    }

    private static int calculateScore(int quiz, int midterm, int secondSemester) {
        return (quiz + midterm + secondSemester) / 3;
    }

    private static String getGrade(int finalScore) {
        String grade = "F";
        if (finalScore > 90) {
            grade = "A";
        } else if (finalScore > 80) {
            grade = "B";
        } else if (finalScore > 70) {
            grade = "C";
        } else if (finalScore > 60) {
            grade = "D";
        } else if (finalScore > 50) {
            grade = "E";
        }
        return grade;
    }
}
