package edu.frcc.csc1061j.SpellChecker;

import java.io.File;
import java.util.Scanner;
/**
 * A utility class that performs spell checking using a MyTreeSet.
 * Loads a dictionary file into a balanced binary search tree and 
 * validates user input against it.
 */
public class SpellChecker {
	/**
     * Main for the SpellChecker application.
     * Requires one command-line argument: the path to a dictionary file.
     * 
     * @param args Command-line arguments; index 0 should be the dictionary filename.
     */
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Error: Please provide a dictionary file.");
            return;
        }

        MyTreeSet<String> dictionary = new MyTreeSet<>();

        try (Scanner fileScanner = new Scanner(new File(args[0]))) {
            while (fileScanner.hasNext()) {
                dictionary.add(fileScanner.next());
            }
        } catch (Exception e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }

        System.out.println("Loaded words into a tree with height = " + dictionary.getTreeHeight());

        Scanner input = new Scanner(System.in);
        while (true) {
            String word = input.next();
            if (word.equals("END")) break;

            if (dictionary.contains(word)) {
            	System.out.println("Correct!");
            } else {
                System.out.println(word + " is spelled wrong!");
            }
        }
    }
}

