package com.Homework_4;

import java.util.HashMap;

public class Day4_Q3 {

	public static void main(String[] args) {
		HashMap<Integer, String> employeesMap = new HashMap<Integer, String>();
		
		print(employeesMap);
		
		employeesMap.put(10001,"Tim Jackson");
		employeesMap.put(10002,"Sarah Hamilton");
		employeesMap.put(10003,"Emily Dilvon");
		employeesMap.put(10004,"Maxwell Garson");
		employeesMap.put(10005,"Paul Beem");
		employeesMap.put(10006,"Jacob Temben");
		employeesMap.put(10007,"Jessica Elwiss");
		
		print(employeesMap);
		employeesMap.put(10000+(employeesMap.size()+1), "Tom Camber");
		employeesMap.put(10000+(employeesMap.size()+1), "Hitomi Watanabe");
		
		System.out.println("\n********* Employee HashMap with Two New Employees *********");
		print(employeesMap);
		
		System.out.println("\nRemoving employee at position 6=" + employeesMap.get(10006) + "...");
		employeesMap.remove(10006);
		print(employeesMap);
	}

	public static void print(HashMap employeesMap) {
		if(employeesMap.isEmpty()) {
			System.out.println("\nemployeesMap is empty.");
		} else {
			System.out.println("\n" + employeesMap);
		}
	}
}
