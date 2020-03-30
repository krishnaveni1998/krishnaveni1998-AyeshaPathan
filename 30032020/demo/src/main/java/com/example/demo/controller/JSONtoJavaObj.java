package com.example.demo.controller;

import java.io.IOException;
import com.example.demo.model.Employee;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONtoJavaObj {

	public static void main(String[] args) {

		Employee employee = null;
		ObjectMapper mapper = new ObjectMapper();
		String EmployeeJson = "{\"id\": \"101\", \"firstName\": \"Ayesha\", \"lastName\" : \"Pathan\", \"salary\" : \"25000\"}";
		try {
			// readValue() - Method to deserialize JSON content from given file into given Java type.
			employee = mapper.readValue(EmployeeJson, Employee.class);
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(employee);

	}

}
