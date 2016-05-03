package com.gojavaonline2.vasylchenko.practice.task_2;

/*Дано число. Треба замінити i-й біт замінити на нуль.
Наприклад:
для числа 6 в бінарному вигляді 110,
замінивши 2-й біт на нуль отримаємо 100 тобто 4.
1<= i <= 32*/

public class SetZero {
    public int set(int num, int i) {
        int result;
        StringBuilder stringBuilder = new StringBuilder(Integer.toBinaryString(num));
        while (stringBuilder.length() < 32)
            stringBuilder.insert(0,'0');
        stringBuilder.setCharAt(stringBuilder.length() - i,'0');
        if (stringBuilder.charAt(0) == '1') {
            for (int j = 0; j < stringBuilder.length(); j++) {
                 if (stringBuilder.charAt(j) == '0')
                     stringBuilder.setCharAt(j,'1');
                else if (stringBuilder.charAt(j) == '1')
                stringBuilder.setCharAt(j,'0');
            }
            result = -1*(Integer.parseInt(stringBuilder.toString(),2)+1);
        }
        else result = Integer.parseInt(stringBuilder.toString(),2);
        return result;
    }
}