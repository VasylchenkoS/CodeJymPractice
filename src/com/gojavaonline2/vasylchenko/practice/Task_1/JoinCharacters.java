package com.gojavaonline2.vasylchenko.practice.task_1;

//З'єднати масив символів в число.
//Приклад: Для [ '1', '2', '3'] повернути 123

public class JoinCharacters {
    public int join(char[] input) {
        if (input.length == 0)
            return 0;
        StringBuilder s = new StringBuilder();
        for (char anInput : input) {
            if(Character.isDigit(anInput))
                s.append(Character.getNumericValue(anInput));
        }
        return (s.length() == 0) ? 0 : Integer.parseInt(s.toString());
    }
}
