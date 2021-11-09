package com.mycompany.exercises.chapter4.exercise4;

public class Circle extends Shape{

    private double radius;

    public Circle(Point center, double radius) {
        super(center);
        this.radius = radius;
    }

    public Point getCenter() {
        return point;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", center=" + point +
                '}';
    }
}
