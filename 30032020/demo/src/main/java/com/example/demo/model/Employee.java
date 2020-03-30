package com.example.demo.model;

public class Employee {

	private int id;

	private String firstName;

	private String lastName;

	private double salary;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	// Creating toString
	@Override
	public String toString() {
		return "Employee [Employee ID=" + id + ", First Name=" + firstName
				+ ", Last Name=" + lastName + ", Salary=" + salary + "]";
	}
}

// fastest to
// parse:https://blog.overops.com/the-ultimate-json-library-json-simple-vs-gson-vs-jackson-vs-json/