package com.expedia.rows;

public class Seconds implements Time {
    public String time(int seconds){
        return seconds % 2 == 0 ? "R" : "O";
    }
}
