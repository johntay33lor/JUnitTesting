package com.junit;

import java.util.Scanner;

public class BoilingWater {
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number greater than 212: ");
        num = input.nextInt();

        if (isWaterBoiling(num)) {
            System.out.print("Water is boiling!!!");
        } else {
            System.out.print("Error!");
        }
    }

    public static boolean isWaterBoiling(int num) {
        return num >= 212;
    }
}


