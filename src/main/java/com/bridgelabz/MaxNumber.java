package com.bridgelabz;

import java.util.Scanner;

public class MaxNumber<E extends Comparable> {
    E x, y, z;

    public MaxNumber(E x, E y, E z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static <T extends Comparable> T comparesion(T x, T y, T z) {
        T max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //float value from user
        System.out.println("enter the float value:");
        Float firstNumber = scanner.nextFloat();
        Float secondNumber = scanner.nextFloat();
        Float thirdNumber = scanner.nextFloat();

        Float maxNumber = comparesion(firstNumber, secondNumber, thirdNumber);
        System.out.println("Maximum value is:" + maxNumber);
        System.out.println(" ");
        //integer value form user
        System.out.println("enter the integer value:");
        Integer firstNumbers = scanner.nextInt();
        Integer secondNumbers = scanner.nextInt();
        Integer thirdNumbers = scanner.nextInt();

        Integer maxNumbers = comparesion(firstNumbers, secondNumbers, thirdNumbers);
        System.out.println("Maximum value is: " + maxNumbers);
        System.out.println(" ");
        //string value from user
        System.out.println("enter the String:");
        String firstString = scanner.next();
        String secondString = scanner.next();
        String thirdString = scanner.next();

        String maxString = comparesion(firstString,secondString , thirdString);
        System.out.println("Maximum value is:" + maxString);
        scanner.close();
    }
}