package com.gojavaonline2.vasylchenko.practice.task_2;

//Дано 2 числа в системі числення з основою 36.
// Будь-яка цифра може бути в межах [0-9a-z].
//        Повернути суму чисел, також в системі 36.
//        Наприклад:
//        "9" + "1" = "a"
//        "z" + "1" = "10"

public class AddNumberBase36 {
    private static StringBuilder alphabetArray = new StringBuilder("0123456789abcdefghijklmnopqrstuvwxyz");
    public String add(String a, String b) {
        int max = Math.max(a.length(), b.length());
        a = prepare(a, max);
        b = prepare(b, max);
        StringBuilder result = new StringBuilder();
        int k = 0;
        for (int j = 0; j < max; j++) {
            StringBuilder s = new StringBuilder(addValue(String.valueOf(a.charAt(j)), String.valueOf(b.charAt(j))));
            StringBuilder s1;
            if (s.length() != 1 && j != 0) {
                s1 = new StringBuilder(addValue(String.valueOf(result.charAt(k - 1)), String.valueOf(s.charAt(0))));
                if (s.length() > 1)
                    s1.append(s.charAt(1));
                result.deleteCharAt(k - 1);
            } else s1 = s;
            result.append(s1);
            if ((k == 1) && (result.length() == 3))
                k++;
            k++;
        }
        return result.toString();
    }

    public String addValue(String s1, String s2) {
        int a = alphabetArray.indexOf(s1);
        int b = alphabetArray.indexOf(s2);
        StringBuilder result = new StringBuilder();
        int q = a + b;
        if (q >= 36) {
            result.append(alphabetArray.charAt(1));
            q -= 36;
        }
        return result.append(alphabetArray.charAt(q)).toString();
    }

    public String prepare(String s, int num) {
        s = s.toLowerCase();
        StringBuilder result = new StringBuilder(s);
        while (result.length() < num)
            result.insert(0, 0);
        return result.toString();
    }
}
