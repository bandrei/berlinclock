package com.expedia.rows;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SingleMinutesTest {
    @Test
    public void time() throws Exception {
        SingleMinutes minutes = new SingleMinutes();
        String output = minutes.time(0);
        assertEquals("OOOO", output);
        assertEquals("RRRR", minutes.time(59));
        assertEquals("RROO", minutes.time(32));
        assertEquals("RRRR", minutes.time(34));
        assertEquals("OOOO", minutes.time(35));
    }

}
