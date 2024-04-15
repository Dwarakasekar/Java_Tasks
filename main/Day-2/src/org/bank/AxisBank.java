package org.bank;
class AxisBank extends BankInfo{
	private void deposit() {
		System.out.println("13000");
	}
	
	public static void main(String[] args) {
		AxisBank ax=new AxisBank();
		ax.deposit();
		ax.fixed();
		ax.saving();
	}
	
}
