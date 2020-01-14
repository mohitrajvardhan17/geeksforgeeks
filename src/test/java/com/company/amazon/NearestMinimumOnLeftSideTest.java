package com.company.amazon;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NearestMinimumOnLeftSideTest {

    private NearestMinimumOnLeftSide nearestMinimumOnLeftSide;
    private Integer[] listOfNumbers;

    @Before
    public void setup() {
        this.listOfNumbers = new Integer[]{1, 3, 0, 2, 5};
        this.nearestMinimumOnLeftSide = new NearestMinimumOnLeftSide(listOfNumbers);
    }

    @Test
    public void getListOfNumbersWithLeastOnLeftSide() {
        Integer[] result = this.nearestMinimumOnLeftSide.getListOfNumbersWithLeastOnLeftSide(this.listOfNumbers);
        assertEquals("", new Integer[]{-1, 1, -1, 0, 2}, result);
    }
}
