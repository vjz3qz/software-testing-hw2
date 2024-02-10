package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class CountWordsTest {
    private static CountWords countWords;

    @BeforeAll
    static void setUpBeforeClass() throws Exception {
        countWords = new CountWords();
    }

    @BeforeEach
    void setUp() throws Exception {
        countWords = new CountWords();
    }

    @Test
    void testCountWords() {
        String str = "The dog is running in the park";
        assertEquals(3, countWords.count(str));
    }

    @Test
    void testCountWords2() {
        String str = "The dog is running in the park and barking";
        assertEquals(4, countWords.count(str));
    }

    @Test
    void testCountWords3() {
        String str = "The cats are playing in the garden";
        assertEquals(2, countWords.count(str));
    }

    @Test
    void testCountWords4() {
        String str = "The birds are singing in the trees";
        assertEquals(3, countWords.count(str));
    }
}