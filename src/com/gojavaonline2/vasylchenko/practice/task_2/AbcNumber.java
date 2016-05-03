package com.gojavaonline2.vasylchenko.practice.task_2;

public class AbcNumber {
    public int convert(String num) {
        if (num.length() == 0)
            return -1;
        char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
                'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
                'w', 'x', 'y', 'z'};
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < num.length(); i++) {
            char c = num.charAt(i);
            int a = 0;
            for (int j = 0; j < letters.length; j++) {
                if (c == letters[j]) {
                    string.append(a);
                    j = letters.length;
                }
                a++;
            }
        }
        return Integer.parseInt(string.toString());
    }
}
