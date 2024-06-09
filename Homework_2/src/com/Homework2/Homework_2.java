package com.Homework2;

public class Homework_2 {

	public static void main(String[] args) {
		double a=10.0,b=3.0,c=14.0,answer=0.0;
		boolean result = false;
		answer = a*b+(2*b);
		System.out.println(a + "*" + b + "+(2*" + b + ") = " + (a*b) + " + " + (2*b) + " = " + answer);
		if(b<a||a>14) { result=true; }
		System.out.println("The result of (" + b + "<" + a + " || " + a + ">14) is " + result);
		boolean isTrue = false;
		isTrue = b<a || a>14;
		System.out.println("The result of (" + b + "<" + a + " || " + a + ">14) is " + isTrue);
	}

}
