package com.mycompany.exercises.chapter1.exercise3;

public class Max {

    public static void main(String[] args) {
        int number1, number2, number3;
        number1 = Integer.parseInt(args[0]);
        number2 = Integer.parseInt(args[1]);
        number3 = Integer.parseInt(args[2]);
        System.out.println("First number: " + number1);
        System.out.println("Second number: " + number2);
        System.out.println("Third number: " + number3);

        int max1, max2;

        if (number1 >= number2 && number1 >= number3) {
            max1 = number1;
        }
        else {
            if (number2 >= number3) {
                max1 = number2;
            }
            else {
                max1 = number3;
            }
        }

        System.out.println("Maximum №1: " + max1);

        max2 = Math.max(number1, number2);
        max2 = Math.max(max1, number3);

        System.out.println("Maximum №2: " + max1);

    }

}
