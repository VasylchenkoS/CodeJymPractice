package com.gojavaonline2.vasylchenko.practice.task_4;

/*Дано рядок. Порахувати кількість слів.
Словом вважається послідовність символів англійського алфавіту [a-zA-Z].
Алгоритм повинен працювати за O(N) часу,
тому RegExp використовувати не можна.*/
public class WordNumber {
    public int count(String input) {
        if (input.length() == 0)
            return 0;
        int result = 0;
        for (int i = 1; i < input.length(); i++) {
            if ((!Character.isLetter(input.charAt(i)) || i == input.length()-1) && Character.isLetter(input.charAt(i-1)))
                result += 1;
        }
        return result;
    }
}
