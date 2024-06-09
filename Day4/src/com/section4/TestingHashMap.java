package com.section4;

import java.util.HashMap;

public class TestingHashMap {

	public static void main(String[] args) {
		HashMap<Integer, String> cityNamesMap = new HashMap<Integer, String>();
		
		print(cityNamesMap);
		
		cityNamesMap.put(1, "London");
		cityNamesMap.put(2, "Rome");
		cityNamesMap.put(3, "Dublin");
		cityNamesMap.put(4, "Santorini");
		cityNamesMap.put(5, "Osaka");
		cityNamesMap.put(6, "New York");
		cityNamesMap.put(7, "Chicago");
		cityNamesMap.put(8, "Los Angeles");
		cityNamesMap.put(9, "Tokyo");
		cityNamesMap.put(10, "Seoul");
		cityNamesMap.put(11, "Miami");
		
		System.out.println("\nSize of city map is: " + cityNamesMap.size());
		
		print(cityNamesMap);
		
		cityNamesMap.putIfAbsent(cityNamesMap.size()+1, "Cape Town");
		
		//Check if Key exists
		if(cityNamesMap.containsKey(5)) {
			String cityName = cityNamesMap.get(5);
			System.out.println("\nCity stored in location for key value \"5\" is : " + cityName);
		} else {
			System.out.println("\nNo city name stored with key value 5");
		}
		
		System.out.println("\nRemoving city with Key value 6=" + cityNamesMap.get(6) + "...");
		cityNamesMap.remove(6);
		print(cityNamesMap);
		System.out.println("\nRemoving all mappings in cityNamesMap...");
		cityNamesMap.clear();
		print(cityNamesMap);
		
		String[] words = new String[] {"yes","yes","no","yes","no","no","no","yes","no","yes","maybe","maybe","maybe","yes","no"};
		HashMap<String, Integer> wordCount = new HashMap<String, Integer>();
		
		wordCount.put("yes", 0);
		wordCount.put("no", 0);
		wordCount.put("maybe", 0);
		
		for(int w=0; w<words.length; w++) {
			String currWord = words[w];
			int currValue = wordCount.get(words[w]);
			wordCount.put(currWord, currValue+1);
		}
		System.out.println(wordCount);
	}
	
	public static void print(HashMap cityNamesMap) {
		if(cityNamesMap.isEmpty()) {
			System.out.println("\ncityNamesMap is empty.");
		} else {
			System.out.println("\n" + cityNamesMap);
		}
	}
}
