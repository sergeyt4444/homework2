package com.mycompany.exercises.chapter4.exercise5;

import java.util.Objects;

public class Rectangle extends Shape {

    private double width, height;

    public Rectangle(Point topLeft, double width, double height) {
        super(topLeft);
        this.width = width;
        this.height = height;
    }

    public Point getCenter() {
        return new Point(point.getX() + width/2, point.getY() - height /2);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                ", topLeft=" + point +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    @Override
    public Shape clone() {
        return new Rectangle(point.clone(), width, height);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.width, width) == 0 && Double.compare(rectangle.height, height) == 0
                && point.equals(rectangle.point);
    }

    @Override
    public int hashCode() {
        return Objects.hash(point, width, height);
    }
}
