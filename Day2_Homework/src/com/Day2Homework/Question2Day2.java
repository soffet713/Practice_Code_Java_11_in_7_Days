package com.Day2Homework;

import java.util.Scanner;

public class Question2Day2 {

	public static void main(String[] args) {
		String[] menuOptions = new String[] {"+--------------------+","|  a. Word           |","|  b. Games          |","|  c. Study Notes    |","|  d. Exit           |",
				"+--------------------+"};
		
		for(String option : menuOptions) {
			System.out.println(option);
		}
		
		Scanner sc = new Scanner(System.in);
		String choice = "";
		
		do {
			System.out.println("\nChoose a letter option from the menu:");
			choice = sc.next();
			switch(choice) {
				case "a" : System.out.println("User entered " + choice + " - Word");
					break;
				case "b" : System.out.println("User entered " + choice + " - Games");
					break; 
				case "c" : System.out.println("User entered " + choice + " - Study Notes");
					break;
				case "d" : System.out.println("User entered " + choice + " - Exit"); choice = "exit";
					break;
				default : System.out.println("No legal selection was made. - " + choice);
					break;
			}
		} while (choice!="exit");
		System.out.println("You have exited the loop.");
	}
}
