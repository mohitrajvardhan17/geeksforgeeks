package com.company.amazon;

/*
Problem Statement:
Check if a string can be obtained by rotating another string 2 places
Given two strings, the task is to find if a string can be obtained by rotating another string two places.
Examples:

Input: string1 = “amazon”, string2 = “azonam”
Output: Yes
// rotated anti-clockwise

Input: string1 = “amazon”, string2 = “onamaz”
Output: Yes
// rotated clockwiseCheck if a string can be obtained by rotating another string 2 places
Given two strings, the task is to find if a string can be obtained by rotating another string two places.
Examples:

Input: string1 = “amazon”, string2 = “azonam”
Output: Yes
// rotated anti-clockwise

Input: string1 = “amazon”, string2 = “onamaz”
Output: Yes
// rotated clockwise
*/
public class StringRotatorAndChecker {
    private final StringBuilder originalWord;
    private final StringBuilder rotatedWord;

    StringRotatorAndChecker(String originalWord, String rotatedWord) {
        this.originalWord = new StringBuilder(originalWord);
        this.rotatedWord = new StringBuilder(rotatedWord);
    }

    public boolean rotateAndCheck(int rotateBy) {
        return originalWord.equals(rotateWordClockwiseByNumber(rotatedWord, rotateBy)) ||
                originalWord.equals(rotateWordAntiClockwiseByNumber(rotatedWord, rotateBy));
    }

    public StringBuilder rotateWordClockwiseByNumber(StringBuilder word, int rotateBy) {
        //Todo: Check better version https://javarevisited.blogspot.com/2017/07/2-ways-to-check-if-one-string-is-rotation-of-another-String.html
        int length = word.length();
        return new StringBuilder(word.insert(0, word).substring(length - rotateBy, length * 2 - rotateBy));
    }

    public StringBuilder rotateWordAntiClockwiseByNumber(StringBuilder word, int rotateBy) {
        //Todo: Check better version https://javarevisited.blogspot.com/2017/07/2-ways-to-check-if-one-string-is-rotation-of-another-String.html
        int length = word.length();
        return new StringBuilder(word.append(word).substring(rotateBy, length + rotateBy));
    }
}
