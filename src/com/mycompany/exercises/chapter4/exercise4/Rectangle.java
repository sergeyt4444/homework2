package com.mycompany.exercises.chapter4.exercise4;

public class Rectangle extends Shape{

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
}
