package com.mycompany.exercises.chapter1.exercise6;

import java.math.BigInteger;

public class Factorial {

    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        System.out.println("Calculating factorial of " + number);

        System.out.println("Result is " + calculateFactorial(number));

        System.out.println("1000! = " + calculateFactorial(1000));
    }

    private static BigInteger calculateFactorial(int number) {
        BigInteger result = BigInteger.valueOf(1);
        if (number < 0) {
            System.out.println("Factorial of " + number + " is undefined: negative number");
            result = BigInteger.valueOf(0);
        }
        else {
            for (int i = 1; i <= number; i++) {
                result = result.multiply(BigInteger.valueOf(i));
            }
        }
        return result;
    }

}
