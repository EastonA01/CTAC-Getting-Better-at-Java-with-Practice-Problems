package org.example;

public class CountXX {
    /*
    Count the number of "xx" in the given string.
    We'll say that overlapping is allowed, so "xxx" contains 2 "xx".

    countXX("abcxx") → 1
    countXX("xxx") → 2
    countXX("xxxx") → 3
     */

    int countXX(String str) {
        // Ensure characters are all lowercase
        String givenString = str.toLowerCase();
        // Initialize count for # of times xx appears in string
        int count = 0;
        for (int i = 0; i < givenString.length()-1; i++) {
            // Check substring at position i to i+2 for xx
            if (givenString.substring(i, i+2).equals("xx")){
                count++; // Increase count if we found a match
            }
        }
        return count;
    }

}
