package com.listsarraysandhashmaps;

import java.util.Random;

public class TestingArrays {

	public static void main(String[] args) {
		double [] temperatures; //array that will hold temperatures in Celsius
		
		temperatures = new double[5];
		Random r = new Random();
		
		for(int t=0;t<temperatures.length;t++) {
			temperatures[t] = (double)r.nextInt(30-10) + 10.0;
			System.out.println("Temperature at position " + t + " = " + temperatures[t]);
		}
		
		System.out.println("\n********* Random Array *********");
		int randomNumberArray[] = new int[10];
		for(int pos=0; pos<randomNumberArray.length;pos++) {
			randomNumberArray[pos] = (int)(Math.random() * 101);
			System.out.println("randomNumberArray[" + pos + "] = " + randomNumberArray[pos]);
		}
		System.out.println("\n********* String Array *********");
		String[] names = new String[] {"Allan", "Jacob", "Matthew", "Peter", "Ann", "Caroline", "Sarah", "David"};
		for(int s=0;s<names.length;s++) {
			System.out.println("names[" + s + "] = " + names[s]);
		}
	}

}
