package com.bridgelabz.day5;

import java.util.Scanner;

public class BasicCorePrograms {
    public static void main(String[] args) {
        System.out.println("Welcome to java basic programs");
        alphabateOrVowel();
    }

    public static void alphabateOrVowel() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the charecter");
        char charecter = scanner.next().charAt(0);
        if (charecter == 'a' || charecter == 'e' || charecter == 'i' || charecter == 'o' || charecter == 'u' ){
            System.out.println("This is charecter");
        } else {
            System.out.println("This is alphabate");
        }
    }
}