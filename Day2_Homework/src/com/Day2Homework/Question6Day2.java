package com.Day2Homework;

public class Question6Day2 {

	public static void main(String[] args) {
		double var1=173.98, var2=77.13;
		System.out.println("Value of var1 = " + var1 + " and Value of var2 = " + var2);
		System.out.println("Swapping values of var1 and var2");
		for(double temp=0; temp<=var1;) {
			temp = var1;
			var1 = var2;
			var2 = temp;
			System.out.println("Value of var1 = " + var1 + " and Value of var2 = " + var2);
		}
	}

}
