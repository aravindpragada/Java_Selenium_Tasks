package com.java.oopstask;

import com.java.oopstask.model.Student;
import com.java.oopstask.service.StudentService;

public class Task9 { 
	public static void main(String[] args) { 
		Student s = new Student(); 
		s.name = "Arjun"; 
		s.age = 21; 
		StudentService ss = new StudentService(); 
		ss.printStudent(s); 
	} 
} 
