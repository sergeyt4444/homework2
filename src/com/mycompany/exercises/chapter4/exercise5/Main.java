package com.mycompany.exercises.chapter4.exercise5;

public class Main {

    public static void main(String[] args) {

        Point point = new Point(1,1);
        Point point2 = new Point(10, 3);

        Line line = new Line(point, point2);
        Rectangle rectangle = new Rectangle(point, 10, 21);
        Circle circle = new Circle(point, 5);

        System.out.println("Line: " + line);
        System.out.println("The center of line is " + line.getCenter());
        System.out.println("===========================================");

        System.out.println("Circle: " + circle);
        System.out.println("The center of circle is " + circle.getCenter());
        System.out.println("===========================================");

        System.out.println("Rectangle: " + rectangle);
        System.out.println("The center of rectangle is " + rectangle.getCenter());
        System.out.println("===========================================");

        Line clonedLine = (Line)line.clone();
        System.out.println(clonedLine);
        System.out.println(line.equals(clonedLine));
        System.out.println(line == clonedLine);
        clonedLine.point = new Point(0,0);
        System.out.println(line.equals(clonedLine));
        System.out.println("===========================================");

        Circle clonedCircle = (Circle)circle.clone();
        System.out.println(clonedCircle);
        System.out.println(circle.equals(clonedCircle));
        System.out.println(circle == clonedCircle);
        clonedCircle.point = new Point(0,0);;
        System.out.println(circle.equals(clonedCircle));
        System.out.println("===========================================");

        Rectangle clonedRectangle = (Rectangle)rectangle.clone();
        System.out.println(clonedRectangle);
        System.out.println(rectangle.equals(clonedRectangle));
        System.out.println(rectangle == clonedRectangle);
        clonedRectangle.point = new Point(0,0);;
        System.out.println(rectangle.equals(clonedRectangle));

    }


}
