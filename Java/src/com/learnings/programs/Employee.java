package com.learnings.programs;

public class Employee implements java.io.Serializable {
	public int id;
	public String name;

	// Default constructor
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

}