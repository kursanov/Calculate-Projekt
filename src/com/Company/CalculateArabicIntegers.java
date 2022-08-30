package com.Company;

public class CalculateArabicIntegers {
    public static void calculate(String input) {
        String[] strings = input.toString().split("\\W");//Бул коньсолго берилчуу буйруктун узундугун массив String турундо берет
        int num1 = Integer.parseInt(strings[0]);//Бул жакта Strigтини 0 индексини intке айлантырды
        int num2 = Integer.parseInt(strings[1]);//Бул жакта 2чи санды int кылды
        String[] operators = input.toString().split("\\w");
        String operator = operators[operators.length - 1];//Бул жакта амалдын ордун тапты "\\W" без пробел кылат

        int res;
        if (num1 > 10 || num2 > 10) {
            System.out.println("10don kichine san kirgiz");
        } else {
            switch (operator) {
                case "+":
                    res = num1 + num2;
                    System.out.println(res);
                    break;
                case "-":
                    res = num1 - num2;
                    System.out.println(res);
                    break;
                case "*":
                    res = num1 * num2;
                    System.out.println(res);
                    break;

                case "/":
                    res = num1 / num2;
                    System.out.println(res);
                    break;
                default:
                    System.out.println("Sistema rabotaet do 10.");

            }
        }

    }

}

