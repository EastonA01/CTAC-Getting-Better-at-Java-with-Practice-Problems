package org.example;

public class FrontTimes {
    /*
    Given a string and a non-negative int n,
    we'll say that the front of the string is the first 3 chars,
    or whatever is there if the string is less than length 3.
    Return n copies of the front;

    frontTimes("Chocolate", 2) → "ChoCho"
    frontTimes("Chocolate", 3) → "ChoChoCho"
    frontTimes("Abc", 3) → "AbcAbcAbc"
     */

    public static String frontTimes(String str, int n) {
        // Ensure int is non-negative
        if(n <= 0){
            return "";
        }
        else{
            // Ensure string has at least 3 characters and use them
            int length = 3;
            if(str.length() < 3){
                length = str.length();
            }
            String three = str.substring(0,length);
            // Initialize answer
            String answer = "";
            // Print append it n times
            for(int i = 0; i < n; i++){
                answer += three;
            }
            return answer;
        }
    }

    public static void main(String[] args) {
        System.out.println(frontTimes("Ch", 2));
    }
}
