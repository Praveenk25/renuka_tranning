package com.itt.hospital.pojo;

import javax.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Employee")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "EMPLOYEE_ID")
	private int id;
	@Column(name = "EMPLOYEE_NAME")
	private String employeeName;
	@Column(name = "EMPLOYEE_SALARY")
	private double employeeSalary;
	@Column(name = "joiningDate")
	private LocalDate joiningDate;

	public Employee() {

	}

	public Employee(String employeename, double employeesalary, LocalDate joiningdate) {

		this.employeeName = employeename;
		this.employeeSalary = employeesalary;
		this.joiningDate = joiningdate;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public LocalDate getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(LocalDate joiningDate) {
		this.joiningDate = joiningDate;
	}

	public String toString() {
		return "Employee{\n EmployeeName " + employeeName + "\n EmployeeSalary " + employeeSalary + "\n Joining Date "
				+ joiningDate + "}\n";
	}

}
