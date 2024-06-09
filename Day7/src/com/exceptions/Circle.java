package com.exceptions;

import java.text.DecimalFormat;

public class Circle extends TwoDShape
{
	private double radius;
	private final DecimalFormat df = new DecimalFormat ("0.00");

	public Circle(int xPos, int yPos, double radius) throws CircleException
	{
		super(xPos, yPos);
		if(radius < 0)
		{
			//System.out.println("Surely you know the radius cannot be negative...");
			//System.out.println("So the program is QUITTING...");
			//System.exit(0);
			throw new CircleException("Radius cannot be negative...");
		}
		this.radius = radius;
	}
	
	public double calculateArea( )
	{
		return Math.PI * radius * radius;
	}
	public double calculatePerimeter( )
	{
		return 2 * Math.PI * radius;
	}

	public double getRadius()
	{
		return radius;
	}

	public void setRadius(double radius) throws CircleException
	{
		if(radius < 0)
		{
//			System.out.println("Surely you know the radius cannot be negative...");
//			System.out.println("So the program is QUITTING...");
//			System.exit(0);
			throw new CircleException("Radius cannot be negative...");
			
		}
		this.radius = radius;
	}

	
	public String toString()
	{
		return "Circle [radius = " + radius + "]\t[area = " + df.format(this.calculateArea()) + 
				"]\t[perimeter = " + df.format(this.calculatePerimeter()) + "]";
	}

}
