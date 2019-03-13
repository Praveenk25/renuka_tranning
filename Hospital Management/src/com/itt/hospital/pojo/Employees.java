package com.itt.hospital.pojo;

import javax.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Employee")
public class Employees {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "employeeId")
	private int Id;
	@Column(name = "employeeName")
	private String EmployeeName;
	@Column(name = "employeeSalary")
	private double EmployeeSalary;
	@Column(name = "joiningDate")
	private LocalDate JoiningDate;

	public Employees(int Id, String EmployeeName, double EmployeeSalary, LocalDate JoiningDate) {
		this.Id = Id;
		this.EmployeeName = EmployeeName;
		this.EmployeeSalary = EmployeeSalary;
		this.JoiningDate = JoiningDate;

	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		this.Id = id;
	}

	public String getEmployeeName() {
		return EmployeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.EmployeeName = employeeName;
	}

	public double getEmployeeSalary() {
		return EmployeeSalary;
	}

	public void setEmployeeSalary(double employeeSalary) {
		this.EmployeeSalary = employeeSalary;
	}

	public LocalDate getJoiningDate() {
		return JoiningDate;
	}

	public void setJoiningDate(LocalDate joiningDate) {
		this.JoiningDate = joiningDate;
	}

	public String toString() {
		return "Employee{\n EmployeeId " + Id + "\n EmployeeName " + EmployeeName + "\n EmployeeSalary "
				+ EmployeeSalary + "\n Joining Date " + JoiningDate + "}\n";
	}

}
