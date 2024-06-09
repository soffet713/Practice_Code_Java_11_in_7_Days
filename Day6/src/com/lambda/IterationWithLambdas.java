package com.lambda;

import java.util.ArrayList;
import java.util.List;

public class IterationWithLambdas {

	public static void main(String[] args) {
		List<Circle> circleList = new ArrayList<Circle>();
		circleList.add(new Circle(2.5));
		circleList.add(new Circle(88.0));
		circleList.add(new Circle(19.623));
		circleList.add(new Circle(101.01));
		circleList.add(new Circle(6.0));
		circleList.add(new Circle(10.0));
		circleList.add(new Circle(55));
		
		//Ways to loop through the ArrayList
		//1. Using a plain for loop----external iterator
		System.out.println("\n============ Using a plain for-loop ============");
		for(int pos=0; pos<circleList.size(); pos++) {
			System.out.println(circleList.get(pos).toString());
		}
		
		//2. Using the forEach loop----external iterator
		System.out.println("\n============ Using the basic for each loop ============");
		for(Circle circle:circleList) {
			System.out.println(circle.toString());
		}
		
		//3. Using the new method developed in Java called forEach to be used on Collections
		System.out.println("\n============ Using the forEach method on a collection ============");
		circleList.forEach((circle -> System.out.println(circle.toString())));
	}

}
