package com.Day2Homework;

public class Question5Day2 {

	public static void main(String[] args) {
		char c1 = 'a';
		int rowCounter = 0;
		int columnCounter = 0;
		while(rowCounter<3) {
			while(columnCounter<3) {
				System.out.print(c1 + "   ");
				columnCounter++;
				c1++;
			}
			System.out.println("\n");
			c1='a';
			columnCounter = 0; //Reset the columnCounter
			rowCounter++;
		}
	}

}
