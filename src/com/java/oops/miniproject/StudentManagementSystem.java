package com.java.oops.miniproject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

abstract class User {
    public abstract void login();
}

interface Printable {
    void printDetails();
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
}

class Student extends Person implements Printable {
    private String grade;

    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    public String getGrade() { return grade; }

    @Override
    public void printDetails() {
        System.out.println("Name: " + getName() + ", Age: " + getAge() + ", Grade: " + grade);
    }
}

class AdminUser extends User {
    @Override
    public void login() {
        System.out.println("Admin logged in successfully.");
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        AdminUser admin = new AdminUser();
        admin.login();

        while (true) {
            System.out.println("\n1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search by Grade");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter grade: ");
                    String grade = scanner.nextLine();
                    students.add(new Student(name, age, grade));
                    System.out.println("Student added successfully!");
                    break;

                case 2:
                    System.out.println("Student List:");
                    for (Student s : students) {
                        s.printDetails();
                    }
                    break;

                case 3:
                    System.out.print("Enter grade to search: ");
                    String searchGrade = scanner.nextLine();
                    students.stream()
                            .filter(s -> s.getGrade().equalsIgnoreCase(searchGrade))
                            .forEach(Student::printDetails);
                    break;

                case 4:
                    System.out.println("Exiting system.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
