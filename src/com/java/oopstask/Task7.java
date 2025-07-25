package com.java.oopstask;

abstract class Animal{
	abstract void sound();
}
class Dog extends Animal{
	public void sound() {
		System.out.println("Dog Sounds : Bow Bow....");
	}
}
class Cat extends Animal{
	public void sound() {
		System.out.println("Cat Sounds : Meow Meow....");
	}
}
class Cow extends Animal{
	public void sound() {
		System.out.println("Cow Sounds : Ambaaa....");
	}
}

public class Task7 {
	public static void main(String[] args) {
		Animal objDog = new Dog();
		Animal objCat = new Cat();
		Animal objCow = new Cow();
		objDog.sound();
		objCat.sound();
		objCow.sound();
	}

}
