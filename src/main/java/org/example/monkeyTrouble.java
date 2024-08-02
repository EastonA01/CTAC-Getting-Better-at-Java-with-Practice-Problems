package org.example;

public class monkeyTrouble {
    /*
    We have two monkeys, a and b, and the parameters aSmile
    and bSmile indicate if each is smiling. We are in trouble
    if they are both smiling or if neither of them is smiling.
    Return true if we are in trouble.

    monkeyTrouble(true, true) → true
    monkeyTrouble(false, false) → true
    monkeyTrouble(true, false) → false
     */

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        // If both monkeys are smiling/not smiling return true (in trouble)
        if(aSmile == bSmile){ // This satisfy's BOTH smiling and NOT smiling!
            return true;
        }
        // All others return false
        return false;
    }

}
