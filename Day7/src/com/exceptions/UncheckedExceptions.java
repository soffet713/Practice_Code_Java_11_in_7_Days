package com.exceptions;

public class UncheckedExceptions {

	public static void main(String[] args) {
		System.out.println("========= Start of Program ========\n");
		
		int a=12, b=0, answer =0;
		
		try {
			answer = a/b;
			
			System.out.println("a = " + a + "; b = " + b + "; answer = " + answer);
		} catch (ArithmeticException e) {
			System.out.println("======= An Arithmetic Error Occurred =======\n");
			e.printStackTrace();
		}
		
		System.out.println("\n======= The statement after the first try-catch =======\n");
		
		double [] dValues = new double[4];
		
		dValues[0] = 44.77;
		dValues[1] = 99;
		dValues[2] = 12.6;
		dValues[3] = 100.963;
		
		for(double d:dValues) {
			System.out.println("d = " + d);
		}
	}

}
