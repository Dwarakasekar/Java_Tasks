package org.transport.qn9;
import org.road.qn9.*;
import org.air.*;
import org.air.qn9.Air;
import org.water.*;
import org.water.qn9.Water;

public class Transport {
	private void transportForm() {
		System.out.println("it contains name and id");
	}

	public static void main(String[] args) {
		Transport ts=new Transport();
		ts.transportForm();

		Road rd=new Road();
		rd.bike();
		rd.bus();
		rd.car();
		rd.cycle();
		
		Air ar=new Air();
		ar.aeroPlane();
		ar.hashCode();
		
		Water wr=new Water();
		wr.boat();
		wr.ship();
		
		
	}

}
