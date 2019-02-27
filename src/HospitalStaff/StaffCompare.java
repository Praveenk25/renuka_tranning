package HospitalStaff;
import java.util.*;

import HospitalStaff.Staff;

public class StaffCompare {
	SortedSet<Staff> employeeSet = new TreeSet<>();

	public void addEmployee(Staff s) {
		employeeSet.add(s);
	}

	public SortedSet<Staff> showEmployees() {
		return employeeSet;
	}

	
}