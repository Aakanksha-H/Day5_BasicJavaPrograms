package com.bridgelabz.day5;

import java.util.Scanner;

public class BasicCorePrograms {
    public static void main(String[] args) {
        System.out.println("Welcome to java basic programs");
        oddOrEven();
    }

    public static void oddOrEven() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of number");
        int number = scanner.nextInt();

        if (number % 2 == 0){
            System.out.println("The number is even");
        } else if (number < 0){
            System.out.println("The number is negative, please enter positive number");
        } else {
            System.out.println("The number is odd");
        }
    }
}