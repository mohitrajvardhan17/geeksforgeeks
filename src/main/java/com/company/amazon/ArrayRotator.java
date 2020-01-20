package com.company.amazon;

/*
Problem Statement:
Program for array rotation
Write a function rotate(ar[], d, n) that rotates arr[] of size n by d elements.
Array
{1, 2, 3, 4, 5, 6, 7}
Rotation of the above array by 2 will make array
{3, 4, 5, 6, 7, 1 ,2}

Time complexity : O(n)
Auxiliary Space : O(1)
* */
public class ArrayRotator {

    private final Integer num[];

    public ArrayRotator(Integer[] num) {this.num = num;}

    //Todo: find better solution
    public void rotateArray(int rotateBy) {
        for (int i = 0; i < rotateBy; i++) {
            int firstNum = num[0];
            for (int j = 0; j < num.length - 1; j++) {
                num[j] = num[j + 1];
            }
            num[num.length - 1] = firstNum;
        }
    }

    public void displayArray() {
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }
}
