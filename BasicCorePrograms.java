package com.bridgelabz.day5;

import java.util.Scanner;

public class BasicCorePrograms {
    public static void main(String[] args) {
        System.out.println("Welcome to java basic programs");
        harmonicNumber();
    }

    public static void harmonicNumber() {
        System.out.println("Enter the value of n");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double harmonicNumber = 0;

        if (n > 0) {
            for (int i = n; i > 0; i--) {
                harmonicNumber = harmonicNumber + ((double) 1 / (double) n);
                System.out.println(harmonicNumber);
            }
        } else {
            System.out.println("Enter only numbers greater than 0");
        }
    }
}