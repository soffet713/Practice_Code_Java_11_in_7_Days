package com.Day2Homework;

public class Question1Day2 {

	public static void main(String[] args) {
		int valOne = 7, valTwo = 13;
		if(valOne >= valTwo) {
			System.out.println("valOne is greater than or equal to valTwo");
			System.out.println("valOne --> " + valOne + " >= " + valTwo + "<-- valTwo");
		} else {
			System.out.println("valOne is not greater than or equal to valTwo");
			System.out.println("valOne --> " + valOne + " < " + valTwo + " <-- valTwo");
		}
		
		int difference = 0;
		
		if(valOne>=valTwo) {
			difference = valOne-valTwo;
		} else {
			difference = valTwo-valOne;
		}
		System.out.println("The difference between valOne and valTwo is " + difference);
	}

}
