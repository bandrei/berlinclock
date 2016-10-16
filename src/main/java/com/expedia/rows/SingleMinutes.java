package com.expedia.rows;

import org.apache.commons.lang3.StringUtils;

public class SingleMinutes implements Time{
    public String time(int minutes){
        minutes = minutes % 5;
        return StringUtils.repeat("R",minutes) +
                StringUtils.repeat("O", 4 - minutes);
    }
}
