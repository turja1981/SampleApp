package com.tcs.SampleApp.bean;

public class Employee {

	private String empId;

	private String firstName;

	private String lastName;

	private String designation;

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public Employee() {
		super();
	}

	public Employee(String empId, String firstName, String lastName, String designation) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.designation = designation;
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

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String toString() {
		return String.format("id:%s,Name:%s,lastname:%s,designation:%s", empId, firstName, lastName, designation);
	}

}
