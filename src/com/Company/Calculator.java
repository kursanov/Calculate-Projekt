package com.Company;

import com.Company.CalculateArabicIntegers;
import com.Company.CalculateRomanIntegers;

public class Calculator {
    public static void calc(String input) throws MyException {
        if (true) {
            try {
                CalculateArabicIntegers.calculate(input);
            } catch (Exception e) {
                try {
                    CalculateRomanIntegers.calculate(input);
                }catch (Exception es){
                    throw new MyException("Tuura kirgiz");
                }
            }
        } else {
            System.out.println("asfsaa");
        }
    }
}
