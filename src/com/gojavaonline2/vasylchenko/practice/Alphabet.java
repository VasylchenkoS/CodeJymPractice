package com.gojavaonline2.vasylchenko.practice;

//Дано рядок. Перевірити чи містить
//він всі букви англійського алфавіту a-zA-Z.

public class Alphabet {
    public boolean check(String input) {
        input = input.toLowerCase();
        boolean result = true;
        char[] alphabetArray = new char[26];
        int b = 0;
        for (char i = 'a'; i <= 'z'; i++) {
            alphabetArray[b++] = i;
        }
        for (char c : alphabetArray) {
            if (input.indexOf(c) < 0)
                result = false;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Alphabet().check(""));
    }
}