package com.Day7Homework;

import java.text.DecimalFormat;

public class Employee {
	private String name;
	private String surname;
	private int age;
	private double salary;
	final DecimalFormat df = new DecimalFormat("0.00");
	
	public Employee(String name, String surname, int age, double salary) throws EmployeeException
	{
		this.name = name;
		this.surname = surname;
		this.salary = salary;
		if(age>65) {
			throw new EmployeeException("Employee is too old to work.");
		}
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws EmployeeException {
		if(age>65) {
			throw new EmployeeException("Employee is too old to work.");
		}
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name= " + name + ", surname= " + surname + ", age= " + age + ", salary= $" + df.format(salary) + "]";
	}
}
