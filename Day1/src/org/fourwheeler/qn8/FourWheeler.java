package org.fourwheeler.qn8;
import org.allvehicle.qn8.Vehicle;
import org.twowheeler.qn8.TwoWheller;
import org.threewheeler.qn8.ThreeWheeler;
public class FourWheeler {
	private void car() {
		System.out.println("car has four wheels");
	}

	private void bus() {
		System.out.println("bus has four wheels");
	}
	public static void main(String[] args) {
		FourWheeler fr=new FourWheeler();
		fr.bus();
		fr.car();
		
		Vehicle vh=new Vehicle();
		vh.vehicleNecessery();

		ThreeWheeler th=new ThreeWheeler();
		th.auto();
		
		TwoWheller tw=new TwoWheller();
		tw.bike();
		tw.cycle();
	}

}
