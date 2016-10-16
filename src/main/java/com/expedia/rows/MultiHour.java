package com.expedia.rows;

import org.apache.commons.lang3.StringUtils;

public class MultiHour implements Time {
    public String time(int hours){
        hours = hours / 5;
        return StringUtils.repeat("R", hours) +
                StringUtils.repeat("O", 4 - hours);
    }
}
