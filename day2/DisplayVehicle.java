package day2;

public class DisplayVehicle {
	public static void showVehicle(vehicle ...vehicles)
	{
		if(vehicles==null)
		{
			System.out.println("sorry");
		}
		for(vehicle t:vehicles)
		{
			System.out.println("--------------------------------------");
			t.move();
			if(t instanceof FourWheeler)
			{
				((FourWheeler)t).doors();
				((FourWheeler)t).fuelType();
				if(t instanceof Bmw)
				{
					((Bmw)t).musicPlayer();
				}
			}
			
		}
	}

}
