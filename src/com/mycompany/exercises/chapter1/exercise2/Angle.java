package com.mycompany.exercises.chapter1.exercise2;

public class Angle {

    public static void main(String args[]) {
        int number = Integer.parseInt(args[0]);
        System.out.println("Initial number: " + args[0]);
        int angle1 = number%360;
        if (angle1 < 0) {
            angle1 = 360 + angle1;
        }
        System.out.println(angle1);
        int angle2 = Math.floorMod(number,360);
        System.out.println(angle2);
    }

}
