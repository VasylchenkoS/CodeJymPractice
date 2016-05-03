package com.gojavaonline2.vasylchenko.practice.task_2;

public class PositiveAverageNumber {
    public int average(int a, int  b) {
        double result;
        if (a == b)
            result = a;
        else {
            result = (double) a / 2 + (double) b / 2;
        }
        return (int) Math.abs(result);
    }
}
