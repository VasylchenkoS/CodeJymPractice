package com.gojavaonline2.vasylchenko.practice.task_1;

// Знайти максимальне число в масиві.
// Гарантується, що масив завжди не пустий.
public class FindMaxNumber {
    public int max(int[] input) {
        int result = input[0];
        for (int anInput : input) {
            if (result < anInput)
                result = anInput;
        }
        return result;
    }
}
