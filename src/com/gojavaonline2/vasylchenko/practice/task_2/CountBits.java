package com.gojavaonline2.vasylchenko.practice.task_2;

public class CountBits {
    public int count(int num) {
        int result = 0;
        StringBuilder s = new StringBuilder(Integer.toBinaryString(num));
        while (s.length() < 32)
            s.insert(0,0);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1')
                result++;
        }
        return result;
    }
}
