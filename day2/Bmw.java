package day2;

public class Bmw extends FourWheeler {
	private String player;
	public Bmw(int noOfDoors, FuelType fuelType, String player) {
		super(noOfDoors, fuelType);
		this.player = player;
	}

	public void musicPlayer()
	{
		System.out.println("bmw comes with "+player+" player");
	}


	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Bmw moves with auto gear");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("It stops with abs");
	}

}
