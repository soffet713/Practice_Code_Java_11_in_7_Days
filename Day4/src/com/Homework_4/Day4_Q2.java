package com.Homework_4;

import java.util.ArrayList;
import java.util.Collections;

public class Day4_Q2 {

	public static void main(String[] args) {
		ArrayList<String> countryList = new ArrayList<String>();
		countryList.add("Japan");
		countryList.add("Scotland");
		countryList.add("Ireland");
		countryList.add("Greece");
		countryList.add("Italy");
		countryList.add("Jamaica");
		countryList.add("Nigeria");
		
		for(int c=0; c<countryList.size(); c++) {
			System.out.println("Country at position " + c + " = " + countryList.get(c));
		}
		
		Collections.sort(countryList);
		
		System.out.println("\n************ Sorted List of Countries ************");
		
		for(int c=0; c<countryList.size(); c++) {
			System.out.println("Country at position " + c + " = " + countryList.get(c));
		}
	}

}
