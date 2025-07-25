package com.java.task;

public class Task2 {
	byte byteVal;
	short shortVal;
	int integerVal;
	long longVal;
	char charVal;
	double doubleVal;
	float floatVal;
	boolean boolVal;
	public void defaultValues() {
		System.out.println("Byte Default Value : "+ byteVal);
		System.out.println("Short Default Value : "+ shortVal);
		System.out.println("Integer Default Value : "+integerVal);
		System.out.println("long Default Value : "+ longVal);
		System.out.println("char Default Value : "+ charVal);
		System.out.println("double Default Value : "+ doubleVal);
		System.out.println("float Default Value : "+ floatVal);
		System.out.println("boolean Default Value : "+ boolVal);
	}
	public static void main(String[] args) {

		Task2 values= new Task2();
		values.defaultValues();
	}
}
