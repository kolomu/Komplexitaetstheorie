package com.kolomu.lecture2_RegEx_IP_RegexPhone;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class IPRegEx {
    public static void main(String[] args) {
        while(!StdIn.isEmpty()) {
            // HTWG IP: 141.37.20.0 -> 141.37.20.255
            String ipAddress = StdIn.readString();
            // matching from 0 to 255 is a bit more complicated than [0-255] because regex is interpreting each character at a time.
            // [0-9] - single digit numbers
            // [1-9][0-9] - two digit numbers
            // 1[0-9][0-9] - from 100 to 199
            // 2[0-4][0-9] - from 200 to 249
            // 25[0-5] - 250 to 255
            // currently not working 0-decimal leading numbers like 141.37.20.040
            String zeroTo255Regex = "([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])";
            String HTWGIPRangeRegEx = "141[.]37[.]20[.]" + zeroTo255Regex;

            StdOut.println(ipAddress.matches(HTWGIPRangeRegEx) ? "matches a HTWG IP Address!": "doesn't match a HTWG IP Address!");

        }
    }
}
