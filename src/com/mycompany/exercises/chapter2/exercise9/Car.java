package com.mycompany.exercises.chapter2.exercise9;

// Упражнение содержит в себе вопрос, должен ли класс быть иммутабельным.
// Класс не должен быть иммутабельным
// Подразумевается, что машина движется по оси x. Значит, содержимое класса будет меняться в процессе работы с классом.
// Можно было бы сделать класс immutable, игнорируя это, но такая реализация была бы неэффективна по памяти, ведь
// каждый раз, когда состояние Car менялось бы, приходилось бы создавать новый объект класса.


public class Car {

    private double x;
    private double fuel;
    private final double fuelEfficiency;

    public Car(double fuel) {
        this.fuel = fuel;
        fuelEfficiency = 32;
    }

    public Car(double fuel, double fuelEfficiency) {
        this.fuel = fuel;
        this.fuelEfficiency = fuelEfficiency;
    }

    public double getX() {
        return x;
    }

    public double getFuel() {
        return fuel;
    }

    public double getFuelEfficiency() {
        return fuelEfficiency;
    }

    public void drive(double miles) {
        if (miles/fuelEfficiency > fuel){
            System.out.println("Not enough fuel");
            x += fuel*fuelEfficiency;
            fuel = 0;
        }
        else {
            x+= miles;
            fuel -=miles/fuelEfficiency;
        }
    }

    public void refuel(double fuelInc) {
        if (fuelInc < 0) {
            System.out.println("Function requires non-negative argument");
            return;
        }
        fuel += fuelInc;
    }

    @Override
    public String toString() {
        return "Car{" +
                "x=" + x +
                ", fuel=" + fuel +
                ", fuelEfficiency=" + fuelEfficiency +
                '}';
    }
}
