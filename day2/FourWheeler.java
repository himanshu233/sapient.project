package day2;

//import java.rmi.NoSuchObjectException;

public class FourWheeler extends vehicle{
	private int noOfDoors;
	private FuelType fuelType;
	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}
	public FourWheeler(int noOfDoors, FuelType fuelType) {
		super();
		this.noOfDoors = noOfDoors;
		this.fuelType = fuelType;
	}
	public void fuelType() {
		System.out.println("This four wheeler runs on"+fuelType);
	}
	public void doors()
	{
		System.out.println("no of doors are: "+noOfDoors);
	}

}