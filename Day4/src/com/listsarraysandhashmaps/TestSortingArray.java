package com.listsarraysandhashmaps;

import java.util.ArrayList;
import java.util.Collections;

public class TestSortingArray {

	public static void main(String[] args) {
		Circle c1 = new Circle(10);
		Circle c2 = new Circle(20);
		
		int isBigger = c1.compareTo(c2);
		
		if(isBigger>0) {
			System.out.println("c1 is bigger than c2.");
		} else if (isBigger<0) {
			System.out.println("c1 is smaller than c2.");
		} else {
			System.out.println("c1 is equal to c2.");
		}
		
		ArrayList<Circle> circles = new ArrayList<Circle>();
		circles.add(new Circle(99.8));
		circles.add(new Circle(0.0456));
		circles.add(new Circle(44.951));
		circles.add(new Circle(12.03));
		circles.add(new Circle(3.7));
		circles.add(new Circle(105.7894));
		circles.add(new Circle(7.713));
		
		System.out.println("\n************ Circles Before Sorting ************");
		for(int c=0; c<circles.size(); c++) {
			Circle tempCircle = circles.get(c);
			double tempRadius = tempCircle.getRadius();
			System.out.println("circles[" + c + "] has a radius of size: " + tempRadius);
		}
		
		System.out.println("\n**** Circles After Sorting Using Collections.sort() ****");
		
		Collections.sort(circles);
		
		for(int c=0; c<circles.size(); c++) {
			Circle tempCircle = circles.get(c);
			double tempRadius = tempCircle.getRadius();
			System.out.println("circles[" + c + "] has a radius of size: " + tempRadius);
		}
	}

}
