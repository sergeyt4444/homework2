package com.mycompany.exercises.chapter4.exercise5;

public abstract class Shape implements Cloneable{

    protected Point point;

    public void moveBy(double dx, double dy) {
        point.translate(dx,dy);
    }

    public Shape(Point point) {
        this.point = point;
    }

    public abstract Point getCenter();

    @Override
    public abstract Shape clone();

}
