package com.company.amazon;

public class ReplaceDigitZeroWithFive {
    private final Integer num;

    public ReplaceDigitZeroWithFive(Integer num) {
        this.num = num;
    }

    //Todo: find better solution
    public Integer getNumberAfterReplacingZeroWithFive() {
        return Integer.parseInt(String.valueOf(num).replaceAll("0", "5"));
    }
}
