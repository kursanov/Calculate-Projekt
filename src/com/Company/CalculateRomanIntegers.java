package com.Company;

import com.Company.ArabicToRoman;

public class CalculateRomanIntegers {

    public static void calculate(String input) {
        String[] strings = input.toString().split("\\W");
        String num1 = strings[0];
        String num2 = strings[1];
        String[] operators = input.toString().split("\\w");
        String operator = operators[operators.length - 1];
        int a = RomanToArabic.calc(num1);
        int b = RomanToArabic.calc(num2);


        int res;
        if (a > 10 || b > 10) {
            System.out.println("10don kichine san kirgiz");
        } else {
            try{
                switch (operator) {
                    case "+":
                        res = a + b;
                        System.out.println(res);
                        System.out.println(ArabicToRoman.arabicToRoman(res));
                        break;
                    case "-":
                        res = RomanToArabic.calc(num1) - RomanToArabic.calc(num2);
                        System.out.println(ArabicToRoman.arabicToRoman(res));
                        break;
                    case "*":
                        res = RomanToArabic.calc(num1) * RomanToArabic.calc(num2);
                        System.out.println(ArabicToRoman.arabicToRoman(res));
                        break;

                    case "/":
                        res = RomanToArabic.calc(num1) / RomanToArabic.calc(num2);
                        System.out.println(ArabicToRoman.arabicToRoman(res));
                        break;
                    default:
                        System.out.println("Netoo");
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }

    }


}

