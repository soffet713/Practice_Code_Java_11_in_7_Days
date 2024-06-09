package com.Homework3;

import java.util.Scanner;

public class Homework_3 {

	public static void main(String[] args) {
		double answer = 0.0;
		
		System.out.println("Enter a number to convert from Fahrenheit to Celsius:");
		try {
			Scanner scan1 = new Scanner(System.in);
			double fTemp = scan1.nextDouble();
			answer = convertFtoC(fTemp);
			System.out.println(fTemp + " in Fahrenheit converted to Celsius is: " + answer);
			scan1.close();
		} catch (Exception e) {
			System.out.println("Please enter a valid number...");
		}
		
		System.out.println("Enter a number to convert from Celsius to Fahrenheit:");
		try {
			Scanner scan2 = new Scanner(System.in);
			double cTemp = scan2.nextDouble();
			answer = convertCtoF(cTemp);
			System.out.println(cTemp + " in Celcius converted to Fahrenheit is: " + answer);
			scan2.close();
		} catch (Exception e) {
			System.out.println("Please enter a valid number...");
		}
	}
	
	public static double convertCtoF(double temp) {
		double ftemp = (temp*(9.0/5)) + 32;
		return ftemp;
	}
	
	public static double convertFtoC(double temp) {
		double ctemp = (temp-32) * (5.0/9.0);
		return ctemp;
	}
}
