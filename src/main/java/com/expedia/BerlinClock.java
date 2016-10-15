package com.expedia;

import org.apache.commons.lang3.StringUtils;

/**
 * A Camel Application
 */
public class BerlinClock {

    /**
     * A main() so we can easily run these routing rules in our IDE
     */
    public static void main(String... args) throws Exception {
        BerlinClock clock = new BerlinClock();
    }

    public String[] berlinClock(int hour, int minutes, int seconds){
        String[] berlinTimeSlots = new String[5];
        berlinTimeSlots[0] = seconds % 2 == 0 ? "X" : "O";
        berlinTimeSlots[1] = multiHours(hour / 5);
        berlinTimeSlots[2] = singleHours(hour % 5);
        berlinTimeSlots[3] = multiMinutes(minutes);
        berlinTimeSlots[4] = singleMinutes(minutes % 5);
        return berlinTimeSlots;
    }

    public String singleHours(int hours){
        return StringUtils.repeat("R", hours) +
                StringUtils.repeat("O", 4 - hours);
    }

    public String singleMinutes(int minutes){
        return StringUtils.repeat("R",minutes) +
                StringUtils.repeat("O", 4 - minutes);
    }

    public String multiHours(int hours){
        return StringUtils.repeat("R", hours) +
                StringUtils.repeat("O", 4 - hours);
    }

    public String multiMinutes(int minutes){
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

