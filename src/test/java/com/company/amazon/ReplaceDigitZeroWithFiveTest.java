package com.company.amazon;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReplaceDigitZeroWithFiveTest {

    private ReplaceDigitZeroWithFive replaceDigitZeroWithFive;

    @Before
    public void setup() {
        this.replaceDigitZeroWithFive = new ReplaceDigitZeroWithFive(10204);
    }

    @Test
    public void getNumberAfterReplacingZeroWithFive() {
        int result = this.replaceDigitZeroWithFive.getNumberAfterReplacingZeroWithFive();
        assertEquals("", 15254, result);
    }
}
