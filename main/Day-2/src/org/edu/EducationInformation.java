package org.edu;

public class EducationInformation extends Medi{
	public void ug() {
		System.out.println("UG");
	}
	
	public void pg() {
		System.out.println("PG");
	}
	
	public static void main(String[] args) {
		EducationInformation ei=new EducationInformation();
		ei.bA();
		ei.bBa();
		ei.bE();
		ei.bEd();
		ei.bsc();
		ei.bTech();
		ei.dental();
		ei.mbbs();
		ei.ug();
		ei.pg();
		ei.phsiyo();
	}
}