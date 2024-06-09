package com.exceptions;

public class TestingCircle {

	public static void main(String[] args) {
		double[] values = new double[] {22.4,1.9,7.778,3.3};
		
		System.out.println("\n======= Printing out the contents of the array called values =======\n");
		
		for(int x=0; x<values.length; x++) {
			System.out.println("values[" + x + "] = " + values[x]);
		}
		
		System.out.println("\n======= Setting Up the First Circle =======\n");
		try {
			Circle c1 = new Circle(15,15,10);
			System.out.println(c1.toString());
			System.out.println(c1.calculateArea());
			System.out.println(c1.calculatePerimeter());			
		} catch (CircleException e) {
			e.printStackTrace();
		}
		
		System.out.println("\n======= Setting Up the Second Circle =======\n");
		try {
			Circle c2 = new Circle(0,0,-2);
			System.out.println(c2.toString());
			System.out.println(c2.calculateArea());
			System.out.println(c2.calculatePerimeter());
		} catch (CircleException e) {
			e.printStackTrace();
		}
	}

}
