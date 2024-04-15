package org.network.qn10;

public class Wifi {
	private void wifiName() {
		System.out.println("the wifiname is Sunny");
	}

	public static void main(String[] args) {
		
		Wifi wi=new Wifi();
		wi.wifiName();
		
		MobileData mb=new MobileData();
		mb.dataName();
		
		Lan ln=new Lan();
		ln.lanName();
		
		WireLess wl=new WireLess();
		wl.modamName();

	}

}
