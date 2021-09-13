/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 McGreggor Kennison
 */

package org.example;

import java.util.Scanner;

public class ex02 {

    public static void main(String[] args) {

        // prompt for input and scan in
        System.out.print("What is the input string? ");
        Scanner input = new Scanner(System.in);
        String word = input.next();

        // print output with original word and its length
        System.out.println(word + " has " + word.length() + " characters.");

    }
}
