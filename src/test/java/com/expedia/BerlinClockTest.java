package com.expedia;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BerlinClockTest {

    @Test
    public void berlinClock() throws Exception {
        BerlinClock clock = new BerlinClock();
        String[] output = clock.berlinClock(14,35,2);
        assertEquals(5, output.length);
        assertEquals("R", output[0]);
        assertEquals("RROO", output[1]);
        assertEquals("RRRR", output[2]);
        assertEquals("YYRYYRYOOOO", output[3]);
        assertEquals("OOOO", output[4]);

    }
}
