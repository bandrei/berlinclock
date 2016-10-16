package com.expedia.rows;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SingleHourTest {
    @Test
    public void time() throws Exception {
        SingleHour singleHour = new SingleHour();
        assertEquals("OOOO", singleHour.time(0));
        assertEquals("RRRO", singleHour.time(23));
        assertEquals("RROO", singleHour.time(2));
        assertEquals("RRRO", singleHour.time(8));
        assertEquals("RRRR", singleHour.time(14));
    }

}
