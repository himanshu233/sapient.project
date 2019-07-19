package day2;

public class TwoWheeler extends vehicle{
	public void selfStart(boolean flag) {

		System.out.println(flag?"two wheeler has self start":"two wheeler does not has self start");
	}
	public void noOfGear(int noOfGear)
	{
		System.out.println("the no of gears are "+noOfGear);
	}
	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}

}
