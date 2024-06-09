package com.methodsandclasses;

public class TestingMethods {

	public static void main(String[] args) {
		//We will use the String class.
		//Open the documentation to the String class.
		//See the Constructor methods.
		String name; //named memory location of data type String
		name = new String("Andre Jackson"); //Constructed an object
		
		//Let us call a method you have seen before to print this
		System.out.println(name);
		
		//Now let us learn how to call a general method.
		//Look at a method in the String class called char charAt()
		char ch = name.charAt(1);
		System.out.println("char at position 1 of " + name + " is " + ch);
		
		//Now we will learn to call a static method.
		//Look up the Math class in your documentation.
		double randomValue;
		randomValue = Math.random() * 101;
		System.out.println("randomValue = " + Math.round(randomValue*100.0)/100.0);
	}

}
