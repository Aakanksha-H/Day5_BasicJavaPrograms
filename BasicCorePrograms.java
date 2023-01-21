package com.bridgelabz.day5;

import java.util.Scanner;

public class BasicCorePrograms {
    public static void main(String[] args) {
        System.out.println("Welcome to java basic programs");
        functionLeapYear();
    }

    public static void functionLeapYear() {
        System.out.println("Enter the year \n" + "Hint : Please ensure its a four digit number!");
        Scanner sc = new Scanner(System.in);
        boolean leap;
        int year = sc.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                leap = year % 400 == 0;
            } else
                leap = true;
        } else
            leap = false;
        if (leap)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");
    }
}
