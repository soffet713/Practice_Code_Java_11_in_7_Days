package com.lambda;

import java.text.DecimalFormat;

public class Employee
{
	private String firstName;
	private String surname;
	private double salary;
	private final DecimalFormat df = new DecimalFormat("0.00");
	
	public Employee(String firstName, String surname)
	{
		this.firstName = firstName;
		this.surname = surname;
		this.salary = 0.0;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public String getSurname()
	{
		return surname;
	}

	public void setSurname(String surname)
	{
		this.surname = surname;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public void setSalary(double salary)
	{
		this.salary = salary;
	}

	@Override
	public String toString()
	{
		return "Employee [firstName=" + firstName + ", surname=" + surname + ", monthly salary=$" + df.format(salary) + "]";
	}
	
}
