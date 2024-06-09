package com.Conditionals;

public class TestingDoWhileLoop {

	public static void main(String[] args) {
		int counter = 1;
		do {
			if( (counter % 2) == 0 ) {
				System.out.println("Value of counter = " + counter);
			}
			counter++;
		}while(counter<21);
	}

}
