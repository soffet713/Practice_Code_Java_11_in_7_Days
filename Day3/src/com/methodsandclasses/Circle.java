package com.methodsandclasses;

public class Circle extends TwoDShape implements DrawShape {
	private double radius;
	
	public Circle(int x, int y) {
		super(x, y);
		radius = 1.0;
	}
	
	public Circle(int x, int y, double r) {
		super(x,y);
		radius = r;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double r) {
		if(r < 0) {
			this.radius = 1.0;
			return;
		}
		this.radius = r;
	}
	
	public double calculateArea() {
		double area;
		area = Math.round(Math.PI*radius*radius*100.0)/100.0;
		return area;
	}
	
	public double calculatePerimeter() {
		double perimeter;
		perimeter = Math.round(((2*Math.PI*radius)*100.0)/100.0);
		return perimeter;
	}
	
	@Override
	public String toString() {
		return "radius = " + radius;
	}

	@Override
	public void draw() {}
	
	public void draw(int posX, int posY) {
		int r = (int)radius;
		for (int i = 0;i <= posX + r; i++) {
	       for (int j = 1;j <=posY + r; j++) {
	            int xSquared = (i - posX)*(i - posX);
	            int ySquared = (j - posY)*(j - posY);
	            if (Math.abs(xSquared + ySquared - r * r) < r) {
	                System.out.print("#");
	            } else {
	                System.out.print(" ");
	            }
	        }
	        System.out.println();
	    }
	}
}
