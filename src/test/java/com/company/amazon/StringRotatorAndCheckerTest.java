package com.company.amazon;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringRotatorAndCheckerTest {

    private StringRotatorAndChecker testInstance = new StringRotatorAndChecker("Task", "skTa");
    @Test
    public void rotateAndCheck() {
    }

    @Test
    public void rotateWordClockwiseByNumber() {
        assertEquals("", "kTas", testInstance.rotateWordClockwiseByNumber(new StringBuilder("Task"), 1).toString());
        assertEquals("", "skTa", testInstance.rotateWordClockwiseByNumber(new StringBuilder("Task"), 2).toString());
    }

    @Test
    public void rotateWordAntiClockwiseByNumber() {
        assertEquals("", "askT", testInstance.rotateWordAntiClockwiseByNumber(new StringBuilder("Task"), 1).toString());
        assertEquals("", "skTa", testInstance.rotateWordAntiClockwiseByNumber(new StringBuilder("Task"), 2).toString());
    }
}