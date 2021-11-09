package com.mycompany.exercises.chapter3.exercise1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Employee employee = new Employee(0, "Vasya", "Ivanov", 1000);
        Employee employee1 = new Employee(1, "Ivan", "Petrov", 5000);
        Employee employee2 = new Employee(2, "Petr", "Vasiliev", 3000);

        Measurable[] employees = new Measurable[] {employee, employee1, employee2};
        System.out.println("Listing employees: ");
        System.out.println(Arrays.toString(employees));
        System.out.println("Average salary: " + Measurable.average(employees));
    }

}
