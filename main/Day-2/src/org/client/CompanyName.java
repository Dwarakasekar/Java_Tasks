package org.client;

public class CompanyName extends Clients{

	private void company() {
		System.out.println("TCS");
	}
	
	public static void main(String[] args) {
		CompanyName cn=new CompanyName();
		cn.company();
		cn.clientName();
	}
}
