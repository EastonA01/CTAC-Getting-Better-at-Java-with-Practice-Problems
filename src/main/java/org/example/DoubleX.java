package org.example;

public class DoubleX {
    /*
    Given a string, return true if the first instance of "x"
    in the string is immediately followed by another "x".

    doubleX("axxbb") → true
    doubleX("axaxax") → false
    doubleX("xxxxx") → true
     */

    boolean doubleX(String str) {
        // Find first x
        int i = str.indexOf("x");
        // If X is not in string return false
        if (i == -1) {
            return false;
        }
        // Check if i+1 (presumably where the next x is) exists
        if (i + 1 >= str.length()) {
            return false;
        }
        // If it's an X return true
        if(str.charAt(i + 1) == 'x') {
            return true;
        }
        return false; // Catch all
    }
}
