package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class CalTest {
    private static Cal cal;

    @BeforeAll
    static void setUpBeforeClass() {
        cal = new Cal();
    }

    @BeforeEach
    void setUp() throws Exception {
        cal = new Cal();
    }

    @Test
    void testCal() {
        assertEquals(1, cal.cal(1, 1, 1, 2, 1));
    }

    @Test
    void testCal2() {
        assertEquals(2, cal.cal(1, 1, 1, 3, 1));
    }

    @Test
    void testCal3() {
        assertEquals(3, cal.cal(1, 1, 1, 4, 1));
    }

    @Test
    void testCal4() {
        assertEquals(4, cal.cal(1, 1, 1, 5, 1));
    }

    @Test
    void testCal5() {
        assertEquals(5, cal.cal(1, 1, 1, 6, 1));
    }

    @Test
    void testCal6() {
        assertEquals(6, cal.cal(1, 1, 1, 7, 1));
    }

    @Test
    void testCal7() {
        assertEquals(7, cal.cal(1, 1, 1, 8, 1));
    }

    @Test
    void testCal8() {
        assertEquals(8, cal.cal(1, 1, 1, 9, 1));
    }

    @Test
    void testCal9() {
        assertEquals(9, cal.cal(1, 1, 1, 10, 1));
    }

    @Test
    void testCal10() {
        assertEquals(10, cal.cal(1, 1, 1, 11, 1));
    }

    @Test
    void testCal11() {
        assertEquals(11, cal.cal(1, 1, 1, 12, 1));
    }

    @Test
    void testCal12() {
        assertEquals(12, cal.cal(1, 1, 1, 13, 1));
    }

    @Test
    void testCal13() {
        assertEquals(13, cal.cal(1, 1, 1, 14, 1));
    }

    @Test
    void testCalLeapYear() {
        assertEquals(29, cal.cal(2, 1, 3, 1, 2020));
    }

    @Test
    void testCalSameDay() {
        assertEquals(0, cal.cal(1, 1, 1, 1, 2021));
    }
}