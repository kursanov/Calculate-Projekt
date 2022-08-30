package com.Company;

public class RomanToArabic {
    public static int calc(String input) {
        int a = input.length() - 1;
        int prev = 0;
        int result = 0;
        for (int i = a; i >= 0; i--) {
            String res = String.valueOf(input.charAt(i));
            int s = Roman.valueOf(res).getValue();
            if (prev <= s) {
                prev += s;
            } else prev -= s;
        }
        return prev;
    }
}
