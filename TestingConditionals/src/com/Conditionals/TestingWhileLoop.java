package com.Conditionals;

import java.util.Scanner;

public class TestingWhileLoop {

	public static void main(String[] args) {
		System.out.println("First while loop, counter controlled...>>");
		int counter = 0;
		while(counter<3) {
			System.out.println("The counter value = " + counter);
			counter++;
		}
		System.out.println("\nSecond while loop -> sentinal loop...>>");
		Scanner sc = new Scanner(System.in);
		String yesNo = "Yes";
		int num1 = 0;
		while(true) {
			num1 = (int)(Math.random() * 11);
			System.out.println("num1 is equal to: " + num1);
			System.out.println("Enter yes to continue or no to stop..>>");
			yesNo = sc.next();
			if(yesNo.equalsIgnoreCase("no")) {
				break;
			}
		}
		System.out.println("Break has taken you out of the code block for the while(true) loop\n");
		
		System.out.println("\nHere is a nested while loop:");
		int rowCounter = 0;
		int columnCounter = 0;
		while(rowCounter<=2) {
			while (columnCounter<=3) {
				System.out.print(columnCounter + "   ");
				columnCounter++;
			}
			System.out.println();
			columnCounter = 0; //Reset the columnCounter
			rowCounter++;
		}
	}

}
