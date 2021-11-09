package com.mycompany.exercises.chapter4.exercise5;

import java.util.Objects;

public class Circle extends Shape {

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

    @Override
    public Shape clone() {
        return new Circle(point.clone(), radius);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0 && point.equals(circle.point);
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius, point);
    }
}
