package com.mycompany.exercises.chapter4.exercise4;

public class Line extends Shape{

    private Point point2;

    public Line(Point from, Point to) {
        super(from);
        this.point2 = to;
    }

    public Point getCenter() {
        return new Point((point.getX()+point2.getX())/2, (point.getY() + point2.getY())/2);
    }

    @Override
    public String toString() {
        return "Line{" +
                "from=" + point +
                ", to=" + point2 +
                '}';
    }
}
