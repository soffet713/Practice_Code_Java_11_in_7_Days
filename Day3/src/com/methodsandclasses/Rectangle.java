package com.methodsandclasses;

public class Rectangle extends TwoDShape implements DrawShape {
	private double width;
	private double height;
	
	public Rectangle(int x, int y) {
		super(x,y);
		width = 1;
		height = 1;
	}
	
	public Rectangle(int x, int y, double width, double height) {
		super(x,y);
		if(width < 0.0) {
			width = 3.0;
		} else {
			this.width = width;
		}
		if(height < 0.0) {
			height = 3.0;
		} else {
			this.height = height;
		}
	}

	public double getwidth() {
		return width;
	}

	public void setwidth(double width) {
		this.width = width;
	}

	public double getheight() {
		return height;
	}

	public void setheight(double height) {
		this.height = height;
	}
	
	public double calculateArea() {
		double area;
		area = width * height;
		return area;
	}
	
	public double calculatePerimeter() {
		double perimeter;
		perimeter = (2*width) + (2*height);
		return perimeter;
	}
	
	public boolean isSquare() {
		if(height==width) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
	
	@Override
	public void draw() {
		int xPos = (int)height;
		int yPos = (int)width;
		
		for(int w=1; w<=xPos; w++) {
			System.out.println();
			for(int l=1; l<=yPos; l++) {
				if((w==1&&l==1)||(w==1&&l==yPos)||(w==xPos&&l==1)||(w==xPos&&l==yPos)) {
					System.out.print("+");
				} else if((w==1&&l>1)||(w==xPos&&l<yPos)) {
					System.out.print("#");
				} else if (l==1||l==yPos) {
					System.out.print("#");
				} else {
					System.out.print(" ");
				}
			}
		}
	}
}
