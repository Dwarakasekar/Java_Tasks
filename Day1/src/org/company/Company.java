package org.company;

public class Company {
	
	private void companyName() {
		System.out.println("Company Name is Dwaraka Tech Limited");
	}
	
	private void companyId() {
		System.out.println("Company Id is 45239");
	}
	
	private void companyAddress() {
		System.out.println("Company Address is 5, Hyderabad, TL");
	}

	public static void main(String[] args) {
		
		Company com=new Company();
		com.companyName();
		com.companyId();
		com.companyAddress();

	}

}