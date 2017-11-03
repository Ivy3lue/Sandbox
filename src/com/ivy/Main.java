package com.ivy;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        StringBuilder bigWords = new StringBuilder();

        File file = new File("C:\\Users\\Ivy\\Desktop\\Text.txt");
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String trimmedLine = line.replaceAll("[^a-zA-Z0-9]|( )+", " ");
                String[] words = trimmedLine.split(" ");
                for (String word : words) {
                    if (word.length() >= 4) {
                        bigWords.append(word).append(" ");
                    }
                }
            }
            System.out.println(bigWords);
        } catch (FileNotFoundException e) {
            System.out.println("File not found " + file.toString());
        } catch (IOException e) {
            System.out.println("Unable to read file " + file.toString());
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Ivy\\Desktop\\NewText.txt"))) {
            writer.write(String.valueOf(bigWords));
        } catch (IOException e) {
            System.out.println("Unable to write to file " + file.toString());
        }
    }
}