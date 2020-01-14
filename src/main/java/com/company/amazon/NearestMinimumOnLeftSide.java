package com.company.amazon;
/*
Given an array of integers, find the nearest smaller number for every element such that the smaller element is on left side.
Examples:

Input:  arr[] = {1, 6, 4, 10, 2, 5}
Output:         {_, 1, 1,  4, 1, 2}
First element ('1') has no element on left side. For 6,
there is only one smaller element on left side '1'.
For 10, there are three smaller elements on left side (1,
6 and 4), nearest among the three elements is 4.

Input: arr[] = {1, 3, 0, 2, 5}
Output:        {_, 1, _, 0, 2}
Expected time complexity is O(n).
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//Todo: Hard Problem [Need to work again]
public class NearestMinimumOnLeftSide {
    private final Integer[] listOfNumbers;

    NearestMinimumOnLeftSide(Integer[] listOfNumbers) {
        this.listOfNumbers = listOfNumbers;
    }

    public Integer[] getListOfNumbersWithLeastOnLeftSide(Integer[] listOfNumbers) {
        //Todo: find better solution https://www.geeksforgeeks.org/find-the-nearest-smaller-numbers-on-left-side-in-an-array/
        Stack<Integer> stack = new Stack<>();
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < listOfNumbers.length; i++) {
            while (!stack.isEmpty() && stack.peek() >= listOfNumbers[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                result.add(-1);
            } else {
                result.add(stack.peek());
            }
            stack.push(listOfNumbers[i]);
        }
        return result.toArray(new Integer[result.size()]);
    }

}
