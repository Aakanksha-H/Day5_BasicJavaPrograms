package com.bridgelabz.day5;

import java.util.Scanner;

public class BasicCorePrograms {
    public static void main(String[] args) {
        System.out.println("Welcome to java basic programs");
        quotientAndReminder();
    }

    public static void quotientAndReminder() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of dividend");
        int dividend = scanner.nextInt();
        System.out.println("Enter the value of divisor");
        int divisor = scanner.nextInt();

        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        System.out.println("The value of quotient is " + quotient);
        System.out.println("The value of remainder is " + remainder);
    }
}