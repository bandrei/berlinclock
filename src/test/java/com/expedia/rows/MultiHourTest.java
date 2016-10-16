package com.expedia.rows;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultiHourTest {
    @Test
    public void time() throws Exception {
        MultiHour multiHour = new MultiHour();
        assertEquals("OOOO", multiHour.time(0));
        assertEquals("RRRR", multiHour.time(23));
        assertEquals("OOOO", multiHour.time(2));
        assertEquals("ROOO", multiHour.time(8));
        assertEquals("RROO", multiHour.time(14));
    }

}
