package com.gojavaonline2.vasylchenko.practice.task_2;

//Додайте два беззнакових числа, що передаються як рядки.
//"101" + "100" = "1001"

public class AddBinary {
    public String add(String a, String b) {
        return Integer.toBinaryString(Integer.parseInt(a, 2) + Integer.parseInt(b, 2));
    }
//        int max = Math.max(a.length(), b.length());
//        a = prepare(a, max);
//        b = prepare(b, max);
//        StringBuilder result = new StringBuilder();
//        int k = 0;
//        for (int i = 0; i < max; i++) {
//            String s1 = String.valueOf(a.charAt(i));
//            String s2 = String.valueOf(b.charAt(i));
//            StringBuilder s = new StringBuilder(sum(s1, s2));
//            StringBuilder s3;
//            if (s.length() != 1 && i != 0) {
//                s3 = new StringBuilder(sum(String.valueOf(result.charAt(k - 1)), String.valueOf(s.charAt(0))));
//                if (s.length() > 1)
//                    s3.append(s.charAt(1));
//                result.deleteCharAt(k - 1);
//            } else s3 = s;
//            result.append(s3);
//            if ((k == 1) && (result.length() == 3))
//                k++;
//            k++;
//        }
//        return result.toString();
//    }
//
//    private StringBuilder sum(String a, String b) {
//        StringBuilder result = new StringBuilder();
//        if ((String.valueOf(a).equals("1")) && (String.valueOf(b).equals("1"))) {
//            result.append(10);
//        } else if ((String.valueOf(a).equals("1")) || (String.valueOf(b).equals("1")))
//            result.append(1);
//        else result.append(0);
//        return result;
//    }
//
//    public String prepare(String s, int num) {
//        s = s.toLowerCase();
//        StringBuilder result = new StringBuilder(s);
//        while (result.length() < num)
//            result.insert(0, 0);
//        return result.toString();
//    }
}
