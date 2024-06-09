package com.methodsandclasses;

public class TestCircle {
	public static void main(String [] args)
	{
		Circle c1 = new Circle(0,0);
		Circle c2 = new Circle(0,0,34.887);
		
		double c1Radius = c1.getRadius();
		double c2Radius = c2.getRadius();
		
		System.out.println("c1 radius = " + c1Radius);
		System.out.println("c2 radius = " + c2Radius);
		
		c1.setRadius(17.34);
		c1Radius = c1.getRadius();
		System.out.println("c1 radius = " + c1Radius);
		
		System.out.println("c1 area and perimeter are: " + c1.calculateArea() + " and " + c1.calculatePerimeter());
		System.out.println("c1 toString() - " + c1.toString());
		
		System.out.println("c2 area and perimeter are: " + c2.calculateArea() + " and " + c2.calculatePerimeter());
		System.out.println("c2 toString() - " + c2.toString());
	}
}
