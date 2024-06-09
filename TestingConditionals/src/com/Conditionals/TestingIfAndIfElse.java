package com.Conditionals;

public class TestingIfAndIfElse {

	public static void main(String[] args) {
		//variable declarations and initializations
		int a=10, b=3, answer=0;
		
		//Conditional Operators
		System.out.println("*******Conditional Operators*******");
		boolean test;
		test = a>b; //a greater than b
		System.out.println(a + " > " + b + " is " + test);
		test = b!=3; //b not equal to 3
		System.out.println(b + " not equal to 3 is " + test);
		test = a<=10; //a less than or equal to 10
		System.out.println(a + " <= 10 is " + test);
		test = !(b<a);
		System.out.println("!(" + b + "<" + a + ") = " + test);
		
		System.out.println("\n*******if if/else statements*******\n");
		System.out.println("Statement before the first if statement..>>");
		if(a==10) {
			System.out.println("in if(1==10) block....>>>>");
			System.out.println("a does equal 10....>>>>");
		}
		System.out.println("\nStatement after the first if statement..>>");
		System.out.println("b equals " + b);
		
		b++; //Increments b by 1
		System.out.println("Executing b++");
		System.out.println("b now equals: " + b);
		answer = a+b;
		if(answer<=13) {
			System.out.println("in if(answer<=13) block....>>>>");
			System.out.println("answer is not less than or equal to 13....>>>>");
		} else { //this else is married to the if above
			System.out.println("in else(answer > 13) block....>>>>");
			System.out.println("answer does not less than or equal to 13....>>>>");	
			System.out.println("answer does equal " + answer);
		}
		System.out.println("Statement after the if/else statement..>>");
	}

}
