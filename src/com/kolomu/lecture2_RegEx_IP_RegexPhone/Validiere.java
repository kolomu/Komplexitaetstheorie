package com.kolomu.lecture2_RegEx_IP_RegexPhone;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Validiere {
    public static void main(String[] args) {
        while(!StdIn.isEmpty()) {
            String inputNumber = StdIn.readLine();
            boolean isConstancePhoneNumber = inputNumber
                    .matches("(00|\\+|\\+\\+)49(\\s)*7531(\\s)*[1-9][0-9]{3,7}");
            StdOut.println( isConstancePhoneNumber ? "Kostanzer Telefonnummer" : "keine Konstanzer Telefonnummer");
        }
    }
}
