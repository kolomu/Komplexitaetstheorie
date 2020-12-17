package com.kolomu.lecture8_sumproblem;

import edu.princeton.cs.algs4.StdIn;

import java.util.Arrays;

public class SumProblem {

    public static void main(String[] args) {
        while (!StdIn.isEmpty()) {
            String sIntValues = StdIn.readString();
            int[] intValues = Arrays
                    .stream(sIntValues.split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            // Welche Teilmengen der Werte ergeben summiert 0
            for(int i = 0; i < intValues.length; i++) {
                
            }

        }
    }
}
