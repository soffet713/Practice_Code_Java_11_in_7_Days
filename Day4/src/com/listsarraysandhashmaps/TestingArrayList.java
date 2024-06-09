package com.listsarraysandhashmaps;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TestingArrayList {

	public static void main(String[] args) {
		ArrayList list_One;
		
		list_One = new ArrayList();
		
		list_One.add(Integer.valueOf(77));
		list_One.add(new String("Hello Puppet"));
		list_One.add(new Date());
		
		for(int l=0; l<list_One.size(); l++) {
			Object obj = list_One.get(l);
			System.out.println(obj.toString());
		}
		
		System.out.println("\n************ ArrayList of String Objects ************");
		ArrayList<String> nameList = new ArrayList<String>();
		nameList.add("Daphne");
		nameList.add("Freddy");
		nameList.add("Scooby");
		nameList.add("Shaggy");
		nameList.add("Velma");
		
		for(int x=0; x<nameList.size(); x++) {
			String currName = nameList.get(x);
			System.out.println("Name = " + currName);
		}
		
		System.out.println("\n************ Other Methods of ArrayList ************");
		
		boolean contains = nameList.contains("Scooby");
		System.out.println("Does nameList contain Scooby? Answer -> " + contains);
		
		nameList.add(3, "Michael");
		
		System.out.println("Name at position 3 = " + nameList.get(3));
		System.out.println();
		for(int x=0; x<nameList.size(); x++) {
			String currName = nameList.get(x);
			System.out.println("Name = " + currName);
		}
	}

}
