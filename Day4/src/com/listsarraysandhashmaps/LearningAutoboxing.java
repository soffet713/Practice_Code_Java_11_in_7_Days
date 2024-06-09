package com.listsarraysandhashmaps;

import java.util.ArrayList;
import java.util.Collections;

public class LearningAutoboxing {

	public static void main(String[] args) {
		int score = 20;
		int intValue = 99;
		
		Integer iScore = new Integer(score);
		Integer iValue = intValue;
		
		System.out.println("iScore = " + iScore.toString());
		System.out.println("i_Value = " + iValue.toString());
		
		int scoreValue = iScore.intValue();
		
		int intValue2 = iValue;
		
		//Have some fun here
		ArrayList<Double> numberList = new ArrayList<Double>();
		
		numberList.add(22.66);
		numberList.add(0.098);
		numberList.add(99.1);
		numberList.add(3.702);
		numberList.add(100.5619);
		numberList.add(10.55);
		numberList.add(21.88);
		numberList.add(7.713);
		numberList.add(11.2358);
		
		Collections.sort(numberList);
		
		for(int n=0; n<numberList.size(); n++) {
			Double currNum = numberList.get(n);
			System.out.println("numberList[" + n + "] = " + currNum);
		}
	}

}
