package com.mycompany.exercises.chapter1.exercise1;

import java.util.SortedMap;

public class Numbers {

    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        System.out.println("Initial number: " + args[0]);
        System.out.println("Binary: " + Integer.toBinaryString(number));
        System.out.println("Octal: " + Integer.toOctalString(number));
        System.out.println("Hexadecimal: " + Integer.toHexString(number));
        System.out.println("Reciprocal: " + Double.toHexString(1/(double)number));
    }

}
