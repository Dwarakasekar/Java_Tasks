package org.bank;

public class BankInfo {
	
	private void fullName() {
		// TODO Auto-generated method stub
		System.out.println("Client Name: Abu Jaffar");

	}
	
	private void sortCode() {
		// TODO Auto-generated method stub
		System.out.println("Client sort code: 678901");

	}
	
	private void accountNo() {
		System.out.println("Client Account No: 8018341312");
	}
	
	private void Bankaddress() {
		System.out.println("Client Bank Address : 6, Gandhi Nagar, Pulurmur street, Chennai");
	}

	public static void main(String[] args) {
		
		//full name, sort code, account no, bank address
		
		BankInfo ban=new BankInfo();
		ban.fullName();
		ban.sortCode();
		ban.accountNo();
		ban.Bankaddress();
		

	}

}
