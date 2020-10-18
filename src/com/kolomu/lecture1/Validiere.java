package com.kolomu.lecture1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.regex.Pattern;

public class Validiere {
    public static void main(String[] args) {
        while (!StdIn.isEmpty()) {
            String value = StdIn.readString();
            String constanceZIPPattern = "78462|78464|78465|78467";
            boolean isConstanceZIP = Pattern.compile(constanceZIPPattern).matcher(value).matches();
            StdOut.println(isConstanceZIP ? "Konstanzer PLZ" : "keine Konstanzer PLZ");
        }
    }
}
