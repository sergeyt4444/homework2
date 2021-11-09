package com.mycompany.exercises.chapter3.exercise1;

public interface Measurable {

    public double measure();

    public static double average(Measurable[] objects) {
        double avg = 0;
        for (int i = 0; i < objects.length; i++) {
            avg += objects[i].measure();
        }
        avg /= objects.length;
        return avg;
    }

}
