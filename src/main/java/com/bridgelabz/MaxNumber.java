package com.bridgelabz;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the three numbers of floats:");
        Float FirstNumber = scanner.nextFloat();
        Float secondNumber = scanner.nextFloat();
        Float thirdNumber = scanner.nextFloat();
        Float maxNumber = comparesion(FirstNumber,secondNumber,thirdNumber);
        System.out.println("the Maximum value is : "+maxNumber);
        System.out.println("enter the three numbers of String:");
        String FirstNum = scanner.next();
        String secondNum = scanner.next();
        String thirdNum = scanner.next();
        String maxNumb = comparesion(FirstNum,secondNum,thirdNum);
        System.out.println("the Maximum value is : "+maxNumb);
        System.out.println("enter the three numbers of integer:");
        Integer firstNumber = scanner.nextInt();
        Integer SecondNumber = scanner.nextInt();
        Integer ThirdNumber = scanner.nextInt();
        Integer MaxNumber = comparesion(firstNumber,SecondNumber,ThirdNumber);
        System.out.println("the Maximum value is : "+MaxNumber);
    }
    private static Float comparesion(Float firstNumber, Float secondNumber, Float thirdNumber) {
        Float max = firstNumber;
        if(secondNumber.compareTo(max)>0){
            max = secondNumber;
        }
        if (thirdNumber.compareTo(max)>0){
            max = thirdNumber;
        }
        return max;
    }
    private static String comparesion(String firstNumber, String secondNumber, String thirdNumber) {
        String maxNumber = firstNumber;
        if(secondNumber.compareTo(maxNumber)>0){
            maxNumber = secondNumber;
        }
        if (thirdNumber.compareTo(maxNumber)>0){
            maxNumber = thirdNumber;
        }
        return maxNumber;
    }
    private static Integer comparesion(Integer firstNumber, Integer secondNumber, Integer thirdNumber) {
        Integer MaxNumber = firstNumber;
        if(secondNumber.compareTo(MaxNumber)>0){
            MaxNumber = secondNumber;
        }
        if (thirdNumber.compareTo(MaxNumber)>0){
            MaxNumber = thirdNumber;
        }
        return MaxNumber;
    }
}
