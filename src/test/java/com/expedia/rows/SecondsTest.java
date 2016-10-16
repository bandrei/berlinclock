package com.expedia.rows;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SecondsTest {
    @Test
    public void time() throws Exception {
        Seconds seconds = new Seconds();
        assertEquals("R", seconds.time(0));
        assertEquals("O", seconds.time(1));
    }

}
