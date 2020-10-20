package com.kolomu.lecture2;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Task6 {
    public static void main(String[] args) {
        while(!StdIn.isEmpty()) {
            String input = StdIn.readLine();
            boolean isInRegex = input.matches("1.*0|1");

            StdOut.println(isInRegex ? "Matches" : "Don't match");
        }
    }
}
