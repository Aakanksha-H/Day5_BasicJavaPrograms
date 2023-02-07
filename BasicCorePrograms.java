package com.bridgelabz.day5;

import java.util.Scanner;

public class BasicCorePrograms {
    public static void main(String[] args) {
        System.out.println("Welcome to java basic programs");
        swapTwoNumbers();
    }

    public static void swapTwoNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of first number");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter the value of second number");
        int secondNumber = scanner.nextInt();

        int tempVariable = firstNumber;
        firstNumber =  secondNumber;
        secondNumber = tempVariable;


        System.out.println("After swap the value of first number is " + firstNumber);
        System.out.println("After swap the value of second number is  " + secondNumber);
    }
}