package com.bridgelabz.day5;

import java.util.Scanner;

public class BasicCorePrograms {
    public static void main(String[] args) {
        System.out.println("Welcome to java basic programs");
        logestAmongstThree();
    }

    public static void logestAmongstThree() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter the second number");
        int secondNumber = scanner.nextInt();
        System.out.println("Enter the third number");
        int thirdNumber = scanner.nextInt();

        String longets = (firstNumber > secondNumber && firstNumber > thirdNumber) ? "First is longest"
                : (secondNumber > firstNumber && secondNumber > thirdNumber) ? "Second number is longets"
                : "Third number is longest" ;

        System.out.println(longets);
    }
}