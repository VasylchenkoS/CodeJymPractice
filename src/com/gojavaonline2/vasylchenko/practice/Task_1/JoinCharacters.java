package com.gojavaonline2.vasylchenko.practice.Task_1;

//З'єднати масив символів в число.
//Приклад: Для [ '1', '2', '3'] повернути 123

public class JoinCharacters {
    public int join(char[] input) {
        int result = 0;
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < input.length; i++) {
            s.append(Character.getNumericValue(input[i]));
        }
        return result = Integer.parseInt(s.toString());
    }
}
