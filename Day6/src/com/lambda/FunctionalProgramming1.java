package com.lambda;

import java.util.ArrayList;

public class FunctionalProgramming1 {

	public static void main(String[] args) {
		ArrayList<String> sports = new ArrayList<String>();
		
		sports.add("Golf");
		sports.add("Bowling");
		sports.add("Tennis");
		sports.add("Football");
		sports.add("Basketball");
		sports.add("Hockey");
		sports.add("Baseball");
		sports.add("Swimming");
		sports.add("Soccer");
		sports.add("Ping Pong");
		
		System.out.println("================ Printing out the sport list using a plain for loop. ================");
		print(sports);
		System.out.println("================ Printing out the sport list using a for each loop. ================");
		printB(sports);
		System.out.println("================ Now let's get Functional ================");
		printFunctional(sports);
		System.out.println("================ Now let's get Sorting Functional ================");
		printSortingFunctional(sports);
	}
	
	public static void print(ArrayList<String> sports) {
		for(int p=0; p<sports.size(); p++) {
			System.out.println(sports.get(p));
		}
	}
	
	public static void printB(ArrayList<String> list) {
		for(String sport:list) {
			System.out.println(sport);
		}
	}
	
	private static void printFunctional(ArrayList<String> sports) {
		sports.stream().forEach(sportElement -> System.out.println(sportElement));
	}
	
	private static void printSortingFunctional(ArrayList<String> sports) {
		sports.sort((s1, s2) -> s1.compareTo(s2));
		sports.stream().forEach(sportElement -> System.out.println(sportElement));
	}
}
