package com.kolomu.lecture2;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class IPRegEx {
    public static void main(String[] args) {
        while(!StdIn.isEmpty()) {
            String ipAddress = StdIn.readString();
            // HTWG IP: 141.37.20.0 -> 141.37.20.255
            String HTWGIPRangeRegEx = "141[.]37[.]20[.][0-255]";

            if(ipAddress.matches(HTWGIPRangeRegEx)) {
                StdOut.println("matches a HTWG IP Address!");
            } else {
                StdOut.println("doesn't match a HTWG IP Address!");
            }
        }
    }
}
