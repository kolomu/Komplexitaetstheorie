package com.kolomu.lecture8_sumproblem;

import edu.princeton.cs.algs4.StdIn;

import java.util.Arrays;

public class SubsetSumProblem {

    public static void main(String[] args) {
        System.out.println("4 Integerwerte (leerzeichen getrennt) eingeben:");
        while(StdIn.hasNextLine()) {
            int[] intValues = Arrays
                    .stream(StdIn.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            int results = 0;
            for (int i = 0; i < intValues.length; i++) {
                for (int j = i+1; j < intValues.length; j++) {
                    for (int k = j+1; k < intValues.length; k++) {
                        for (int l = k+1; l < intValues.length; l++) {
                            if (intValues[i] + intValues[j] + intValues[k] + intValues[l] == 0) {
                                results++;
                                System.out.println("Found solution: " + intValues[i] + "+" + intValues[j] + "+" + intValues[k] + "+" + intValues[l]);
                            }
                        }
                    }
                }
            }


            if (results == 0) {
                System.out.println("Found no result!");
            } else {
                System.out.println("Amount of solutions: " + results);
            }

        }
    }
}
