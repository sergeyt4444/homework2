package com.mycompany.exercises.chapter1.exercise4;

public class DoubleValues {

    public static void main(String[] args) {
        System.out.println("Largest positive double value: " + Double.MAX_VALUE);

        System.out.println("Or " + Double.POSITIVE_INFINITY + " depending on whether we count infinity or not");

        System.out.println("Smallest positive double value: " + Double.MIN_VALUE);

        System.out.println("Using Math.nextUp: " + Math.nextUp((double) 0));
    }

}
