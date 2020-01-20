package com.company.amazon;

import org.junit.Test;

public class ArrayRotatorTest {

    @Test
    public void rotateArray() {
        Integer arr[] = {1, 2, 3, 4, 5, 6, 7};
        ArrayRotator arrayRotator = new ArrayRotator(arr);
        arrayRotator.displayArray();
        arrayRotator.rotateArray(2);
        arrayRotator.displayArray();
    }
}
