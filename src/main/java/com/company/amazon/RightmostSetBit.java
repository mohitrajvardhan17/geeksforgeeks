package com.company.amazon;

/*
Problem Statement:
Write a one line function to return position of first 1 from right to left, in binary representation of an Integer.

I/P    18,   Binary Representation 010010
O/P   2
I/P    19,   Binary Representation 010011
O/P   1
* */

public class RightmostSetBit {
    private final Integer num;

    public RightmostSetBit(Integer num) {
        this.num = num;
    }

    //Todo: Hard Problem [Need to work again]
    public Integer getPositionOfRightmostSetBitForNum() {
        System.out.println(Integer.toBinaryString(num));
        System.out.println(Integer.toBinaryString(num>>>1));
        return (int)((Math.log10(num & -num)) / Math.log10(2)) + 1;
    }
}
