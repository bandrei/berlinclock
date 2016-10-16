package com.expedia.rows;

import org.apache.commons.lang3.StringUtils;

public class MultiMinutes implements Time{
    public String time(int minutes){
        int quarters = minutes / 15;
        char firstQuarter = quarters >= 1 ? 'R' : 'O';
        char secondQuarter = quarters >= 2 ? 'R' : 'O';
        char thirdQuarter = quarters >= 3 ? 'R' : 'O';
        String multiMinutes = StringUtils.repeat("Y", minutes / 5);
        multiMinutes += StringUtils.repeat("O", 11 - minutes / 5);
        char[] allMins = multiMinutes.toCharArray();
        allMins[2] = firstQuarter;
        allMins[5] = secondQuarter;
        allMins[8] = thirdQuarter;
        return new String(allMins);
    }
}
