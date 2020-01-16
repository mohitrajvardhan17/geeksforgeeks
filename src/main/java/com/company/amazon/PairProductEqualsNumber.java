package com.company.amazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/*
Problem Statement:
Given an array of distinct elements and a number x, find if there is a pair with a product equal to x.

Examples :
Input : arr[] = {10, 20, 9, 40};
        int x = 400;
Output : Yes

Input : arr[] = {10, 20, 9, 40};
        int x = 190;
Output : No

Input : arr[] = {-10, 20, 9, -40};
        int x = 400;
Output : Yes

Input : arr[] = {-10, 20, 9, 40};
        int x = -400;
Output : Yes

Input : arr[] = {0, 20, 9, 40};
        int x = 0;
Output : Yes

Naive approach ( O(n2) )
Better Solution (O(n Log n)
* */
public class PairProductEqualsNumber {
    private final Integer[] arr;

    public PairProductEqualsNumber(Integer[] arr) {
        this.arr = arr;
    }

    //Todo: find better solution
    //Todo: check if this custom solution breaks
    public boolean checkIfPairProductEqualsNumber(int number) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(this.arr));
        Set<Integer> remainder = new HashSet<>();
        Collections.sort(arr);
        for (Integer num : arr) {
            if(num == 0 && number == 0) {
                return true;
            }
            if (num != 0 && number % num == 0) {
                int count = 0;
                if (!remainder.add(num)) {
                    count++;
                }
                if (!remainder.add(number / num)) {
                    count++;
                }
                if (count == 2) {
                    return true;
                }
            }
        }
        return false;
    }
}
