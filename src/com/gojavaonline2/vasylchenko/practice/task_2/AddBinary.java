package com.gojavaonline2.vasylchenko.practice.task_2;

//Додайте два беззнакових числа, що передаються як рядки.
//"101" + "100" = "1001"

class AddBinary {
    public String add(String a, String b) {
        int max = Math.max(a.length(), b.length());
        a = prepare(a, max);
        b = prepare(b, max);
        StringBuilder result = new StringBuilder();
        int k = 0;
        for (int i = 0; i < max; i++) {
            String s1 = String.valueOf(a.charAt(i));
            String s2 = String.valueOf(b.charAt(i));
            StringBuilder s = new StringBuilder(sum(s1, s2));
            StringBuilder s3;
            if (s.length() != 1 && i != 0) {
                s3 = sum(String.valueOf(result.charAt(k - 1)), String.valueOf(s.charAt(0)));
                result.deleteCharAt(k - 1);
                if (s.length() > 1)
                    s3.append(s.charAt(1));
            } else s3 = s;
            result.append(s3);
            if ((k == 0) && (result.length() == 2))
                k++;
            k++;
        }
        return result.toString();
    }

    private StringBuilder sum(String a, String b) {
        StringBuilder result = new StringBuilder();
        if ((String.valueOf(a).equals("1")) && (String.valueOf(b).equals("1"))) {
            result.append(10);
        } else if ((String.valueOf(a).equals("1")) || (String.valueOf(b).equals("1")))
            result.append(1);
        else result.append(0);
        return result;
    }

    public String prepare(String s, int num) {
        StringBuilder result = new StringBuilder(s);
        while (result.length() < num)
            result.insert(0, 0);
        return result.toString();
    }
}