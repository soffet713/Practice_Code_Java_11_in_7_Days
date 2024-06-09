package com.Day2Homework;

import java.util.Scanner;

public class Question4Day2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double sum = 0.0;
		double mark = 0.0;
		int counter = 0;
		
		do {
			System.out.println("Enter the mark for the next student: ");
			mark = sc.nextDouble();
			sum+=mark;
			System.out.println("Current student's mark = " + mark);
			counter++;
		} while (mark!=-1.0);
		counter--;
		System.out.println("Average mark for " + counter + " students = " + Math.round((sum/counter)*100.0)/100.0);
	}

}
