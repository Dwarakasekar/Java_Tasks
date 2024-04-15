package org.employee;

public class EmployeeInfo {
	private void empId() {
		System.out.println("EmployeeId: 45454");
	}
	
	private void empName() {
		System.out.println("EmployeeName:Dwaraka");
	}
	
	private void empDob() {
		System.out.println("Employee dob: 21.05.2004");
	}
	private void empPh() {
		System.out.println("Employee Phone number : 6382486917");
	}
	
	private void empMailid() {
		System.out.println("Employee Mail id: dwar@gmail.com");
	}
	
	private void empAdd() {
		System.out.println("Employee Address is: 56, nehru street, chennai");
	}

	public static void main(String[] args) {
		EmployeeInfo emp=new EmployeeInfo();
		
		emp.empId();
		emp.empName();
		emp.empDob();
		emp.empPh();
		emp.empMailid();
		emp.empAdd();
	}

}
