package com.gojavaonline2.vasylchenko.practice;

//Для даного числа поміняти всі біти місцями відносно центра.
//        Наприклад:
//        Для 2 (10) повернути 1073741824 (01000000000000000000000000000000).

public class ReverseBits {
    public int reverse(int input) {
        int result;
        StringBuilder a = new StringBuilder(Integer.toString(input, 2));

        if (a.charAt(0) == '-')
            a.deleteCharAt(0);
        a = a.reverse();
        while (a.length() < 32) {
            a.setLength(a.length() + 1);
            a.setCharAt(a.length()-1, '0');
        }
        if (a.toString().equals("10000000000000000000000000000000"))
            return Integer.MIN_VALUE;
        return result = Integer.parseInt(a.toString(), 2);
    }
}
