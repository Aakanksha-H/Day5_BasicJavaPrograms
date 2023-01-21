package com.bridgelabz.day5;

import java.util.Scanner;

public class BasicCorePrograms {
    public static void main(String[] args) {
        System.out.println("Welcome to java basic programs");
        flipCoin();
    }

    public static void flipCoin(){
        int coinFlipNumber = 0, head = 0, tail = 0, percentTail = 0, percentHead = 0;

        System.out.println("Number of times to flip coin");
        Scanner sc = new Scanner(System.in);
        coinFlipNumber = (int) sc.nextDouble();

        if (coinFlipNumber < 0) {
            System.out.println("Number of times to flip coin should be positive");
        }

        for (int input = 0; input < coinFlipNumber; input++) {
            double flipCoin = Math.round(Math.random() * 10) % 2;
            if (flipCoin > 0.5) {
                System.out.println("You have got the tail");
                tail++;
            } else {
                System.out.println("You have got the heads");
                head++;
            }
        }

        percentHead = (int) ((double) head / coinFlipNumber * 100);
        System.out.println("Percent of heads count is " + percentHead + "%");
        percentTail = (int) ((double) tail / coinFlipNumber * 100);
        System.out.println("Percent of tails count is " + percentTail + "%");
    }
}
