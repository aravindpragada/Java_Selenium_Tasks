package com.school.student;

public class Student {
    public static String SCHOOL_NAME = "Greenwood High";

    private String name;
    private int roll;

    public Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    public void display() {
        System.out.println("Name: " + name + ", Roll: " + roll);
    }

    public static void showSchoolName() {
        System.out.println("School: " + SCHOOL_NAME);
    }
}
