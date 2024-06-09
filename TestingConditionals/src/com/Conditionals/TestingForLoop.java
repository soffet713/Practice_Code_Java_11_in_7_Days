package com.Conditionals;

import java.util.Scanner;

public class TestingForLoop {

	public static void main(String[] args) {
		System.out.println("First for loop -> counter controlled...>>");
		
		for(int counter=0; counter<3; counter++) {
			System.out.println("The counter value is = " + counter);
		}
		
		System.out.println("\nSecond for loop -> counter controlled...>>");
		int counter = 100;
		for(;counter>=0;) {
			System.out.println("The counter value = " + counter);
			counter = counter - 35;
		}
		
		System.out.println("\nThird for loop -> sentinel loop...>>");
		Scanner sc = new Scanner(System.in);
		
		String yesNo = "Yes";
		int num1 = 0;
		int sum = 0;
		System.out.println("The value of num1 = " + num1);
		for(;;) {
			num1+=50;
			System.out.println("The value of num1 = " + num1);
			sum+=num1;
			counter-=10;
			System.out.println("Enter yes to continue or no to stop..>>");
			yesNo = sc.next();
			if(yesNo.equalsIgnoreCase("no")) {
				System.out.println("Current value of counter: " + counter);
				break;
			}
		}
		System.out.println("Current value of sum: " + sum);
		System.out.println("You have broken out of the empty for(;;) loop");
	}

}
