package org.example;

public class SleepIn {
    public boolean sleepIn(boolean weekday, boolean vacation){
        // If it's not a weekday, and we are on vacation return true
        if(!weekday){
            if(vacation){
                return true;
            }
        }
        // If it is not the weekday we sleep in
        if(!weekday){
            return true;
        }
        // If it is a weekday BUT we are on vacation we STILL sleep in
        if(weekday){
            if(vacation){
                return true;
            }
        }
        // All other instances will return false (presuming its a weekday and no vacation)
        return false;
    }
}
