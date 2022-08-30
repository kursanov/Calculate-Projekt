package com.Company;

import com.Company.Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws MyException {
        System.out.println("The system can only work with numbers from 10 gears!");
        System.out.println("You can work with one condition or only with com.Company.Roman or Arabic numerals!");
        System.out.println("And remote shades of commands on the console!");
        System.out.println( "Construction:(X+,-,*,/V) , (10+,-,*,/5 )");
        Scanner scanner = new Scanner(System.in);
        String san = scanner.nextLine();
        Calculator.calc(san);
    }
}




