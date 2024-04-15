package org.college1;

public class College {
	private void collegeName() {
		System.out.println("MSAJCE");
	}
	
	private void collegeCode() {
		System.out.println("Code is 1301");
	}
	private void collegeRank() {
		System.out.println("Rank is 1");
	}
	
	public static void main(String[] args) {
		
		College c=new College();
		c.collegeName();
		c.collegeRank();
		c.collegeCode();
		
		
		Student st=new Student();
		st.studentName();
		st.studentDept();
		st.studentId();
		
		Hostel hs=new Hostel();
		hs.hostelName();
		
		
		Dept dp=new Dept();
		dp.deptName();
		
		
	}

}
