package com.mycompany.exercises.chapter4.exercise4;

public abstract class Shape {

    protected Point point;

    public void moveBy(double dx, double dy) {
        point.translate(dx,dy);
    }

    public Shape(Point point) {
        this.point = point;
    }

    public abstract Point getCenter();

}
