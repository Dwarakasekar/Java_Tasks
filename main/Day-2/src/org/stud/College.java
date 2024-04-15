package org.stud;

public class College {
	public void collegeName() {
		System.out.println("MSAJCE");
	}
	
	public void collegecode() {
		System.out.println("1301");
	}

	public void collegeRank() {
		System.out.println("2nd ");
	}
}

class Student extends College{
	public void studentName() {
		System.out.println("Dwaraka");
	}
	
	public void studentDept() {
		System.out.println("IT");
	}
	
	public void deptName() {
		System.out.println("IT DEpt");
	}
	
	public static void main(String[] args) {
		Student st=new Student();
		st.studentName();
		st.studentDept();
		st.deptName();
		st.collegeName();
		st.collegecode();
		st.collegeRank();
	}
}