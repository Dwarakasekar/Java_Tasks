package org.phone;

public class PhoneInfo {
	private void phoneName() {
		System.out.println("Phone Name is Redmi 10T Pro");
	}
	
	private void phoneMieiNum() {
		System.out.println("PhoneMieiNum  is: 45454545 ");
	}
	
	private void camera() {
		System.out.println("Camera pixels is:720px");
	}
	
	private void storage() {
		System.out.println("128GB storage");
	}
	private void osName() {
		System.out.println("OS is Octa-core 4.5");
	}

	public static void main(String[] args) {
		
		PhoneInfo ph=new PhoneInfo();
		ph.phoneName();
		ph.phoneMieiNum();
		ph.camera();
		ph.storage();
		ph.osName();

	}

}

