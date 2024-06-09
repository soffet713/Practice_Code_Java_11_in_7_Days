package com.lambda;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Day6Q2 {

	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList<Employee>();
		final DecimalFormat df = new DecimalFormat("0.00");
		
		employees.add(new Employee("Tim", "Sanders"));
		employees.add(new Employee("Sarah", "Hamilton"));
		employees.add(new Employee("Paul", "Beem"));
		employees.add(new Employee("Emily", "Simon"));
		employees.add(new Employee("Maxwell", "Garson"));
		employees.add(new Employee("Jacob", "Temben"));
		employees.add(new Employee("Jessica", "Elwiss"));
		employees.add(new Employee("Tom", "Stewart"));
		employees.add(new Employee("Hitomi", "Watanabe"));
		employees.add(new Employee("Ricky", "Pearsall"));
		employees.add(new Employee("George", "Kittle"));
		employees.add(new Employee("Nick", "Bosa"));
		employees.add(new Employee("Deebo", "Samuel"));
		employees.add(new Employee("Dre", "Greenlaw"));
		employees.add(new Employee("Brock", "Purdy"));
		employees.add(new Employee("Christian", "McCaffrey"));
		employees.add(new Employee("Brandon", "Aiyuk"));
		employees.add(new Employee("Fred", "Warner"));
		employees.add(new Employee("Kyle", "Juszczyk"));
		employees.add(new Employee("Trent", "Williams"));
		employees.add(new Employee("Jauan", "Jennings"));
		
		double randomSalary = 0.0;
		
		for(Employee e : employees) {
			randomSalary = ((Math.random() * (15000-5000)) + 5000);
			e.setSalary(randomSalary);
			System.out.println("Salary = $" + df.format(e.getSalary()) + " per month for " + e.getFirstName() + " " + e.getSurname());
		}
		
		System.out.println("\n======= Only Employees Making Less Than $7000 =======");
		employees.stream().filter(employee -> employee.getSalary() < 7000).forEach(employee -> System.out.println(employee.toString()));
		
		System.out.println("\n======= Only Employees Whose Surname Starts with the Letter S =======");
		employees.stream().filter(employee -> employee.getSurname().charAt(0) == 'S').forEach(employee -> System.out.println(employee.toString()));
	}

}
