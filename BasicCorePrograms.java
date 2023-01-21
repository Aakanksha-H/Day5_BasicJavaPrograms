package com.bridgelabz.day5;

import java.util.Scanner;

public class BasicCorePrograms {
    public static void main(String[] args) {
        System.out.println("Welcome to java basic programs");
        powerOfTwo();
    }

    public static void powerOfTwo(){
        System.out.println("Enter the value of power");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (0 <= n && n < 31) {
            for (int i = 1; i <= n; i++) {
                int power = (int) Math.pow(2, i);
                System.out.println(power);
            }
        } else {
            System.out.println("Enter only numbers between 0 and 31");
        }
    }
}
