package com.company.amazon;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class PairProductEqualsNumberTest {
    private PairProductEqualsNumber pairProductEqualsNumber;

    @Before
    public void setup() {
        Integer arr[] = new Integer[]{0, 20, 9, 40};
        this.pairProductEqualsNumber = new PairProductEqualsNumber(arr);
    }

    @Test
    public void checkIfPairProductEqualsNumber() {
        boolean result = pairProductEqualsNumber.checkIfPairProductEqualsNumber(0);
        assertTrue("", result);
    }
}
