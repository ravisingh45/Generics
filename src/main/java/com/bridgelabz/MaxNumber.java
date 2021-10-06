package com.bridgelabz;
import java.util.Arrays;

public class MaxNumber<E extends Comparable<E>> {
    E[] elements;

    public void findMax(E[] elements) {
        this.elements = elements;
    }

    public static <T> T comparable(T[] elements) {
        Arrays.sort(elements);
        int length = elements.length;
        T max = elements[length - 1];
        return max;
    }

    public static void main(String[] args) {
        Integer[] maxInt = { 1,12,123,1234,12345};
        System.out.println("Maximum integer value is: " + comparable(maxInt));

        Double[] maxDouble = {1.2,1.23,12.3,123.123,0.123 };
        System.out.println("Maximum double value is: " + comparable(maxDouble));

        String[] maxString = { "Haresh","sourabh","vaishnavi","divya","ashish" };
        System.out.println("Maximum string is: " + comparable(maxString));

    }
}