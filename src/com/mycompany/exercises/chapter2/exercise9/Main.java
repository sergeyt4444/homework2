package com.mycompany.exercises.chapter2.exercise9;


public class Main {
    public static void main(String[] args) {
        Car car = new Car(10, 30);
        System.out.println(car);
        car.drive(100);
        System.out.println(car);
        car.refuel(1);
        car.drive(1000);
        System.out.println(car);
    }
}
