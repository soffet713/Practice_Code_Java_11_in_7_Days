package com.Homework_4;

import java.text.DecimalFormat;
import java.util.Arrays;

public class Day4_Q1 {

	public static void main(String[] args) {
		double[] salaries = new double[200];
		double lowestSalary, highestSalary, sum = 0.0;
		final DecimalFormat df = new DecimalFormat("0.00");
		
		for(int s=0; s<salaries.length; s++) {
			salaries[s] = ((Math.random() * 20001) + 5000);
			System.out.println("New random salary: $" + df.format(salaries[s]));
			sum+=salaries[s];
		}
		
		double averageSalary = sum/200;
		lowestSalary = salaries[0];
		highestSalary = salaries[0];
		
		for(int x=0; x<salaries.length; x++) {
			if(lowestSalary>salaries[x]) { lowestSalary = salaries[x]; }
			if(highestSalary<salaries[x]) { highestSalary = salaries[x]; }
		}
		
		System.out.println("The lowest salary is: $" + df.format(lowestSalary));
		System.out.println("The highest salary is: $" + df.format(highestSalary));
		System.out.println("The avarage salary is: $" + df.format(averageSalary));
		Arrays.sort(salaries);
		
		for(double salary : salaries) {
			System.out.println("$" + df.format(salary));
		}
		
		for(int x=0; x<salaries.length; x++) {
			double newValue = salaries[x] * 1.05;
			salaries[x] = newValue;
			System.out.println("New salary with 5% increast at salary[" + x + "] = $" + df.format(salaries[x]));
		}
	}
}
