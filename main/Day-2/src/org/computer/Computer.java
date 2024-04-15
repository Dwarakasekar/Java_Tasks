package org.computer;

public class Computer {
	public void computerModel1() {
		System.out.println("Intel");
	}

}

class Desktop extends Computer{
	private void desktopsize() {
		System.out.println("24");
	}
	
	public static void main(String[] args) {
		Desktop ds=new Desktop();
		ds.desktopsize();
		ds.computerModel1();
	}
}
