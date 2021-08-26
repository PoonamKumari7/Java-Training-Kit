package techment.Day5.Interface.Demo1_InterfaceVehicle;

public class XUV implements Vehicle {

	/** added interface while making the class XUV, so it automatically overrides the method */
	@Override
	public void seatCapacity() {
		
		System.out.println("XUV seat capacity is 7");

	}

}
