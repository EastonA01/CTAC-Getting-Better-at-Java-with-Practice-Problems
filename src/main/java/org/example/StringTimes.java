package org.example;

public class StringTimes {
    /*
    Given a string and a non-negative int n,
    return a larger string that is n copies of the original string.

    StringTimes("Hi", 2) → "HiHi"
    StringTimes("Hi", 3) → "HiHiHi"
    StringTimes("Hi", 1) → "Hi"
     */

    public String stringTimes(String str, int n) {
        // Ensure the integer is non-negative
        if (n <= 0) {
            return "";
        }
        else{
            // Build the string in a for loop n times
            StringBuilder strBuilder = new StringBuilder(str);
            for (int i = 1; i < n; i++) {
                strBuilder.insert(0, str); // Append to string
            }
            str = strBuilder.toString(); // Format to string
            return str;
        }
    }

}
