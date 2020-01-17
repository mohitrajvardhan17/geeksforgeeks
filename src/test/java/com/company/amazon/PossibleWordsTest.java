package com.company.amazon;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PossibleWordsTest {
    private PossibleWords possibleWords;

    @Before
    public void setup() {
        this.possibleWords = new PossibleWords("ABCD");
    }


    @Test
    public void getAllPossibleWords() {
        String[] result = this.possibleWords.getAllPossibleWords();
        assertNotNull("", result);
        assertEquals("", 8, result.length);
    }
}
