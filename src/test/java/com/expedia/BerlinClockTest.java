package com.expedia;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by abara on 15/10/2016.
 */
public class BerlinClockTest {

    @Test
    public void berlinClock() throws Exception {
        BerlinClock clock = new BerlinClock();
        String[] output = clock.berlinClock(0,0,0);
        assertEquals(output.length, 5);

    }

    @Test
    public void testSingleMinutes(){
        BerlinClock clock = new BerlinClock();
        String[] output = clock.berlinClock(0,0,0);
        assertEquals(5, output.length);
        assertEquals("OOOO", output[4]);
        assertEquals("XXXX", clock.berlinClock(23,59,0)[4]);
        assertEquals("XXOO", clock.berlinClock(04,32,0)[4]);
        assertEquals("XXXX", clock.berlinClock(04,34,0)[4]);
        assertEquals("OOOO", clock.berlinClock(12,35,0)[4]);
    }

    @Test
    public void testMultiMinutes(){
        BerlinClock clock = new BerlinClock();
        String[] output = clock.berlinClock(0,0,0);
        assertEquals(5, output.length);
        assertEquals("OOOOOOOOOOO", output[3]);
        assertEquals("YYRYYRYYRYY", clock.berlinClock(23,59,59)[3]);
        assertEquals("OOOOOOOOOOO", clock.berlinClock(12,04,0)[3]);
        assertEquals("YYRYOOOOOOO", clock.berlinClock(12,21,0)[3]);
        assertEquals("YYRYYRYOOOO", clock.berlinClock(12,35,0)[3]);
    }

}
