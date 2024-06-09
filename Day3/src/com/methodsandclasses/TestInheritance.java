package com.methodsandclasses;

public class TestInheritance {

	public static void main(String[] args) {
		int xpos, ypos;
		/*
		TwoDShape tds = new TwoDShape(12, 33);
		
		xpos = tds.getxPos();
		ypos = tds.getyPos();
		
		System.out.println("tds x position = " + xpos + " and y position = " + ypos);
		System.out.println("tds toString() method = " + tds.toString());
		
		tds.setxPos(77);
		tds.setyPos(41);
		xpos = tds.getxPos();
		ypos = tds.getyPos();
		
		System.out.println("tds x position = " + xpos + " and y position = " + ypos);
		System.out.println("tds toString() method = " + tds.toString());
		*/
		Circle c1 = new Circle(14,55,10.759);
		xpos = c1.getxPos();
		ypos = c1.getyPos();
		
		System.out.println("c1 x position = " + xpos + " and y position = " + ypos);
		
		double area = c1.calculateArea();
		double perm = c1.calculatePerimeter();
		
		System.out.println("c1 area = " + area + " and c1 perimeter = " + perm);
		
		System.out.println("c1 toString() method: " + c1.toString());
		
		System.out.println("Testing Polymorphism");
		
		TwoDShape tds2;
		tds2 = c1;
		area = tds2.calculateArea();
		perm = tds2.calculatePerimeter();
		System.out.println("tds2 area = " + area + " and tds2 perimeter = " + perm);
		
		System.out.println("tds2 toString() method: " + tds2.toString());
		
		Circle c3 = new Circle(3,3,5);
		
		//DrawShape ds;
		//ds = c3;
		c3.draw(5,10);
		
		Rectangle r1 = new Rectangle(5,5,7,5);
		
		r1.draw();
		
		System.out.println("\n\n" + r1.toString());
	}

}
