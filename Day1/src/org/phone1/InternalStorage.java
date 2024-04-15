package org.phone1;

public class InternalStorage {
	
	private void processorName() {
		System.out.println("The internal processor is Snapdragon");
	}
	
	private void ramSize() {
		System.out.println("THE ram Size is 64mb");
	}

	public static void main(String[] args) {
		
		InternalStorage in=new InternalStorage();
		in.processorName();
		in.ramSize();
		
		ExternalStorage ex=new ExternalStorage();
		ex.size();
		

	}

}
