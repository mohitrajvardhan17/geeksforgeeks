package com.company.amazon;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RightmostSetBitTest {

    private RightmostSetBit rightmostSetBit;

    @Before
    public void setup() {
        this.rightmostSetBit = new RightmostSetBit(18);
    }

    @Test
    public void getPositionOfRightmostSetBitForNum() {
        int result = this.rightmostSetBit.getPositionOfRightmostSetBitForNum();
        assertEquals("", 2, result);
    }
}
