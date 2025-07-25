package com.java.exceptionHandling;

import com.school.student.Student;

import static com.school.student.Student.SCHOOL_NAME;
import static com.school.student.Student.showSchoolName;

public class Task4 {
 public static void main(String[] args) {
     Student s1 = new Student("Aravind", 101);
     s1.display();

     System.out.println("Static Imported School Name: " + SCHOOL_NAME);
     showSchoolName();
 }
}
