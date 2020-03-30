package com.example.demo.controller;

import com.example.demo.model.Employee;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaObjToJSON {

	public static void main(String args[]) throws Exception {
		Employee emp = new Employee();
		emp.setId(001);
		emp.setFirstName("Ayesha");
		emp.setLastName("Pathan");
		emp.setSalary(25000);
		// Creating the ObjectMapper object
		ObjectMapper mapper = new ObjectMapper();
		// Converting the Object to JSONString
		String jsonString = mapper.writeValueAsString(emp);
		System.out.println(jsonString);
	}

}