package com.company.amazon;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class RectangleOverlapsTest {
    private RectangleOverlaps rectangleOverlaps;

    @Before
    public void setup() {
        RectangleOverlaps.Point l1 = new RectangleOverlaps.Point(0, 10);
        RectangleOverlaps.Point r1 = new RectangleOverlaps.Point(10, 0);
        RectangleOverlaps.Point l2 = new RectangleOverlaps.Point(5, 5);
        RectangleOverlaps.Point r2 = new RectangleOverlaps.Point(15, 0);
        this.rectangleOverlaps = new RectangleOverlaps(l1, r1, l2, r2);
    }

    @Test
    public void rectanglesOverlap() {
        boolean result = this.rectangleOverlaps.rectanglesOverlap();
        assertTrue("", result);
    }
}
