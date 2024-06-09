package com.methodsandclasses;

public class Dice {
	private int faceValue;
	
	public Dice() {
		faceValue = (int)((Math.random()*6) + 1);
	}
	
	public void rollDice() {
		faceValue = (int)((Math.random()*6) + 1);
	}
	
	public int getFaceValue() {
		return faceValue;
	}
}
