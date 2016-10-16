package com.expedia;

import com.expedia.rows.MultiHour;
import com.expedia.rows.MultiMinutes;
import com.expedia.rows.Seconds;
import com.expedia.rows.SingleHour;
import com.expedia.rows.SingleMinutes;
import com.expedia.rows.Time;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Options;

public class BerlinClock {

    private Time[] times;

    public static void main(String... args) throws Exception {
        BerlinClock clock = new BerlinClock();
        Options options = new Options();
        options.addOption("h",true,"Hours");
        options.addOption("m",true, "Minutes");
        options.addOption("s",true, "Seconds");
        CommandLineParser parser = new DefaultParser();
        int hour = 0, minutes = 0, seconds = 0;
        CommandLine commandLine = parser.parse(options, args);
        if(commandLine.hasOption("h")){
            hour = Integer.parseInt(commandLine.getOptionValue("h"));
        }
        if(commandLine.hasOption("m")){
            minutes = Integer.parseInt(commandLine.getOptionValue("m"));
        }
        if(commandLine.hasOption("s")){
            seconds = Integer.parseInt(commandLine.getOptionValue("s"));
        }
        String[] output = clock.berlinClock(hour, minutes, seconds);
        for(String s : output){
            System.out.println(s);
        }
    }



    public BerlinClock(){
        this.times = new Time[]{new Seconds(), new MultiHour(),
            new SingleHour(), new MultiMinutes(), new SingleMinutes()};
    }

    public String[] berlinClock(int hour, int minutes, int seconds){
        String[] berlinTimeSlots = new String[5];
        berlinTimeSlots[0] = times[0].time(seconds);
        berlinTimeSlots[1] = times[1].time(hour);
        berlinTimeSlots[2] = times[2].time(hour);
        berlinTimeSlots[3] = times[3].time(minutes);
        berlinTimeSlots[4] = times[4].time(minutes);
        return berlinTimeSlots;
    }
}

