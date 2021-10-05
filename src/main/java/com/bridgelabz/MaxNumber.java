package com.bridgelabz;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the three numbers:");
        Float FirstNumber = scanner.nextFloat();
        Float secondNumber = scanner.nextFloat();
        Float thirdNumber = scanner.nextFloat();
        Float maxNumber = comparesion(FirstNumber,secondNumber,thirdNumber);
        System.out.println("the Maximum value is : "+maxNumber);
        System.out.println("enter the three numbers:");
        Integer firstNumber = scanner.nextInt();
        Integer SecondNumber = scanner.nextInt();
        Integer ThirdNumber = scanner.nextInt();
        Integer MaxNumber = comparesion(firstNumber,SecondNumber,ThirdNumber);
        System.out.println("the Maximum value is : "+MaxNumber);
    }

    private static Integer comparesion(Integer firstNumber, Integer secondNumber, Integer thirdNumber) {
   Integer max = firstNumber;
   if(secondNumber.compareTo(max)>0){
       max = secondNumber;
   }
   if (thirdNumber.compareTo(max)>0){
       max = thirdNumber;
   }
   return max;
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
}
