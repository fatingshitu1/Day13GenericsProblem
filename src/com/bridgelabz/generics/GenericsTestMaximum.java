package com.bridgelabz.generics;

public class GenericsTestMaximum {
    public static void findMaxValue(Integer a, Integer b, Integer c) {
        Integer max = a;
        if (b.compareTo(max) > 0)
            max = b;
        if (c.compareTo(max) > 0)
            max = c;
        // Print the max number
        System.out.println("Maximum number out of 3 numbers is :- " + max);
    }

    public static void main(String[] args) {
        GenericsTestMaximum.findMaxValue(100, 50, 75);
        GenericsTestMaximum.findMaxValue(1.5f, 3.5f, 5.5f);

    }
    // Given 3 Float find the maximum
    public static void findMaxValue(Float a , Float b , Float c){
        Float max = a;
        if (b.compareTo(max) > 0)
            max = b;
        if (c.compareTo(max) > 0)
            max = c;
        // Print the max number
        System.out.println("Maximum number out of 3 numbers are "+a+ "," +b+ "," +c+ " is :- " + max);
    }
}
