package com.expedia.rows;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultiMinutesTest {
    @Test
    public void time() throws Exception {
        MultiMinutes minutes = new MultiMinutes();
        String output = minutes.time(0);
        assertEquals("OOOOOOOOOOO", output);
        assertEquals("YYRYYRYYRYY", minutes.time(59));
        assertEquals("OOOOOOOOOOO", minutes.time(04));
        assertEquals("YYRYOOOOOOO", minutes.time(21));
        assertEquals("YYRYYRYOOOO", minutes.time(35));
    }

}
