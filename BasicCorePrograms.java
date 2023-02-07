package com.bridgelabz.day5;

import java.util.Scanner;

public class BasicCorePrograms {
    public static void main(String[] args) {
        System.out.println("Welcome to java basic programs");
        factorOfNumber();
    }

    public static void factorOfNumber() {
        System.out.println("Enter the value of n");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n > 0) {
            System.out.print( "The factors of number entered are " + '\n');
            for (int i = 1; i <= n; ++i) {
                if (n % i == 0) {
                    System.out.print( i + " ,");
                }
            }
        } else {
            System.out.println("Enter only numbers greater than 0");
        }
    }
}