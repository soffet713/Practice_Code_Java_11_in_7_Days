package com.Day7Homework;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class TestEmployee {

	public static void main(String[] args) throws EmployeeException {
		ArrayList<Employee> employees = new ArrayList<Employee>();
		double newSalary = 0.0;
		int newAge = 0;
		DecimalFormat df = new DecimalFormat("0.00");
		
		Scanner sc = new Scanner(System.in);
		
		try {
			employees.add(new Employee("Tim", "Sanders", 72, 12357.02));
		} catch (EmployeeException e) {
			System.out.println("Employee is too old to work");
			e.printStackTrace();
		}
		try {
			employees.add(new Employee("Sarah", "Hamilton", 38, 9503.29));
		} catch (EmployeeException e) {
			System.out.println("Employee is too old to work");
			e.printStackTrace();
		}
		try {
			employees.add(new Employee("Paul", "Beem", 25, 7300.00));
		} catch (EmployeeException e) {
			System.out.println("Employee is too old to work");
			e.printStackTrace();
		}
		try {
			employees.add(new Employee("Emily", "Simon", 58, 13456.39));
		} catch (EmployeeException e) {
			System.out.println("Employee is too old to work");
			e.printStackTrace();
		}
		try {
			employees.add(new Employee("Maxwell", "Garson", 67, 13894.23));
		} catch (EmployeeException e) {
			System.out.println("Employee is too old to work");
			e.printStackTrace();
		}
		 
		//employees.add(new Employee("Jacob", "Temben", 29, 8913.93));
		//employees.add(new Employee("Jessica", "Elwiss", 34, 10392.35));
		//employees.add(new Employee("Tom", "Stewart", 47, 12173.93));
		//employees.add(new Employee("Hitomi", "Watanabe", 37, 11392.56));
		
		System.out.println("\n======= Testing Employee.toString() Method =======\n");
		employees.stream().forEach(employee -> System.out.println(employee.toString()));
		
		System.out.println("\n======= Testing Employee.getName() Method =======\n");
		employees.stream().forEach(employee -> System.out.println(employee.getName()));
		
		System.out.println("\n======= Testing Employee.getSurname() Method =======\n");
		employees.stream().forEach(employee -> System.out.println(employee.getSurname()));
		
		System.out.println("\n======= Testing Employee.getAge() Method =======\n");
		employees.stream().forEach(employee -> System.out.println(employee.getAge()));
		
		System.out.println("\n======= Testing Employee.getSalary() Method =======\n");
		employees.stream().forEach(employee -> System.out.println(df.format(employee.getSalary())));
		
		for(Employee e : employees) {
			newSalary = e.getSalary() * 1.06;
			e.setSalary(newSalary);
			System.out.println(e.getName() + " " + e.getSurname() + " has a new salary of: $" + e.getSalary());
		}
		
		employees.add(new Employee("","",0,0.0));
		String newFirstName = null;
		String newSurname = null;
		System.out.println("\nPlease enter your first name:");
		newFirstName = sc.next();
		System.out.println("Please enter your last name:");
		newSurname = sc.next();
		System.out.println("Please enter your age:");
		newAge = sc.nextInt();
		newSalary = ((Math.random() * 10000) + 5000);
		System.out.println();
		employees.get(3).toString();
		System.out.println();
		employees.get(3).setName(newFirstName);
		System.out.println("Testing Employee.setName() - new employee first name has been set to: " + employees.get(3).getName());
		employees.get(3).setSurname(newSurname);
		System.out.println("Testing Employee.setSurname() - new employee surname has been set to: " + employees.get(3).getSurname());
		try {
			employees.get(3).setAge(newAge);
		} catch (EmployeeException e) {
			System.out.println("Employee cannot be older than 65 years old.");
			e.printStackTrace();
		}
		System.out.println("Testing Employee.setAge() - new employee age has been set to: " + employees.get(3).getAge());
		employees.get(3).setSalary(newSalary);
		System.out.println("Testing Employee.setSalary() - new employee salary has been set to: " + employees.get(3).getSalary());
		System.out.println(employees.get(3).toString());
		
		sc.close();
		
		try {
			employees.get(2).setAge(67);
		} catch(EmployeeException e) {
			System.out.println("Employee cannot be older than 65 years old");
			e.printStackTrace();
		}
	}

}
