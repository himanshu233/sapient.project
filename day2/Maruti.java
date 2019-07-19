package day2;

public class Maruti extends FourWheeler {
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("maruti maves with auto/manual gear");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		super.stop();
	}

	public Maruti(int noOfDoors, FuelType fuelType) {
		super(noOfDoors, fuelType);
		// TODO Auto-generated constructor stub
	}

	public void engineStandard(String engineStd) {
		System.out.println("The engine standard is ="+engineStd);
	}


}
