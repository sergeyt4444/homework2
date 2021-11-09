package com.mycompany.exercises.chapter4.exercise5;

import java.util.Objects;

public class Line extends Shape {

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

    @Override
    public Shape clone() {
        return new Line(point.clone(), point2.clone());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Line line = (Line) o;

        return point2.equals(line.point2) && point.equals(line.point);
    }

    @Override
    public int hashCode() {
        return Objects.hash(point, point2);
    }
}
