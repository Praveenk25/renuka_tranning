package HospitalStaff;

import java.time.LocalDate;
import java.util.Comparator;

public class Staff implements Comparable<Staff> {
	private int Id;
	private String EmployeeName;
	private double EmployeeSalary;
	private LocalDate JoiningDate;

	public Staff(int Id, String EmployeeName, double EmployeeSalary, LocalDate JoiningDate) {
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

	@Override
	public int compareTo(Staff o) {
		
		return this.getJoiningDate().compareTo(o.getJoiningDate());
	}

}
