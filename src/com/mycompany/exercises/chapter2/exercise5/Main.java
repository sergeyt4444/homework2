package com.mycompany.exercises.chapter2.exercise5;

public class Main {

    public static void main(String[] args) {
        Point point = new Point(3,4);
        System.out.println(point.translate(1,3).scale(0.5f).toString());
    }

}
