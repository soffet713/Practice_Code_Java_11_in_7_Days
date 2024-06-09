package com.methodsandclasses;

public abstract class TwoDShape {
	private int xPos;
	private int yPos;
	public abstract double calculateArea();
	public abstract double calculatePerimeter();
	
	public TwoDShape(int x, int y) {
		xPos = x;
		yPos = y;
	}

	public int getxPos() {
		return xPos;
	}

	public void setxPos(int xPos) {
		this.xPos = xPos;
	}

	public int getyPos() {
		return yPos;
	}

	public void setyPos(int yPos) {
		this.yPos = yPos;
	}

	@Override
	public String toString() {
		return "TwoDShape [xPos=" + xPos + ", yPos=" + yPos + "]";
	}
}
