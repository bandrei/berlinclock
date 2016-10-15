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
        assertEquals("RRRR", clock.berlinClock(23,59,0)[4]);
        assertEquals("RROO", clock.berlinClock(04,32,0)[4]);
        assertEquals("RRRR", clock.berlinClock(04,34,0)[4]);
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

    @Test
    public void testSingleHours(){
        BerlinClock clock = new BerlinClock();
        String[] output = clock.berlinClock(0,0,0);
        assertEquals(5, output.length);
        assertEquals("OOOO", output[2]);
        assertEquals("RRRO", clock.berlinClock(23,59,59)[2]);
        assertEquals("RROO", clock.berlinClock(2,04,0)[2]);
        assertEquals("RRRO", clock.berlinClock(8,21,0)[2]);
        assertEquals("RRRR", clock.berlinClock(14,35,0)[2]);
    }

    @Test
    public void testMultiHours(){
        BerlinClock clock = new BerlinClock();
        String[] output = clock.berlinClock(0,0,0);
        assertEquals(5, output.length);
        assertEquals("OOOO", output[1]);
        assertEquals("RRRR", clock.berlinClock(23,59,59)[1]);
        assertEquals("OOOO", clock.berlinClock(2,04,0)[1]);
        assertEquals("ROOO", clock.berlinClock(8,21,0)[1]);
        assertEquals("RROO", clock.berlinClock(14,35,0)[1]);
    }

    @Test
    public void testClockFull(){
        BerlinClock clock = new BerlinClock();
        String[] output = clock.berlinClock(14,35,2);
        assertEquals(5, output.length);
        assertEquals("X", output[0]);
        assertEquals("RROO", output[1]);
        assertEquals("RRRR", output[2]);
        assertEquals("YYRYYRYOOOO", output[3]);
        assertEquals("OOOO", output[4]);
    }

}
