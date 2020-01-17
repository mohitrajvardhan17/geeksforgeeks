package com.company.amazon;

/*
c
Given a string you need to print all possible strings that can be made by placing spaces (zero or one) in between them.
Input:  str[] = "ABC"
Output: ABC
        AB C
        A BC
        A B C

Output:
ABCD
ABC D
AB CD
AB C D
A BCD
A BC D
A B CD
A B C D

Expected time complexity is O(n*(2^n)).
*/

import java.util.LinkedHashSet;
import java.util.Set;

public class PossibleWords {
    private final String originalWords;

    public PossibleWords(String orginalWords) {
        this.originalWords = orginalWords;
    }

    //Todo: Hard Problem [Took lot of time hence Need to work again]
    //Todo: find better solution
    public String[] getAllPossibleWords() {
        Set<String> distinctWord = new LinkedHashSet<>();
        distinctWord.add(this.originalWords);
        for (int i = 1; i < originalWords.length(); i++) {
            for (int j = 1; j < originalWords.length(); j++) {
                Set<String> temp = new LinkedHashSet<>();
                for (String word : distinctWord) {
                    if (word.charAt(j - 1) != ' ' && word.charAt(j) != ' ') {
                        temp.add(new StringBuilder(word).insert(j, " ").toString());
                    }
                }
                distinctWord.addAll(temp);
            }
        }
        return distinctWord.toArray(new String[distinctWord.size()]);
    }
}
