package com.gojavaonline2.vasylchenko.practice.Task_1;

// Знайти максимальне число в масиві.
// Гарантується, що масив завжди не пустий.
public class FindMaxNumber {
    public int max(int[] input) {
        int result = input[0];
        for (int i = 0; i < input.length; i++) {
            if (result<input[i])
                result = input[i];
        }
        return result;
    }
}
