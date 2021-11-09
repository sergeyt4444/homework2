package com.mycompany.exercises.chapter3.exercise2;

// Упражнение содержит вопрос, почему нам нужен cast при реализации метода largest.
// Метод largest работает с массивом Measurable. Метод largest должен выводить имя
// работника с наибольшей зарплатой.
// Немного нелогично передавать в метод, который должен выводить имя работника, массив Measurable.
// cast нам нужен потому, что метод getName есть у Employee, но отсутствует у Measurable.
// Если мы пропишем в Measurable метод getName, сможем обойтись без cast, при этом все реализации
// интерфейса будут обязаны переопределить метод getName.

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

    public static String largest(Measurable[] objects) {
        if (objects.length == 0) {
            return "Empty array";
        }
        String maxName = ((Employee)objects[0]).getName();
        double max = objects[0].measure();
        for (int i = 1; i < objects.length; i++) {
            if (max < objects[i].measure()) {
                max = objects[i].measure();
                maxName = ((Employee)objects[i]).getName();
            }
        }
        return maxName;
    }

}
