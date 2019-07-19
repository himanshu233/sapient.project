package day2;

public class Impl {
	public static void main(String[] args) {
		vehicle [] v=new vehicle[5];
		v[0]=new Bmw(2,FuelType.petrol,"sony");
		v[1]=new Maruti(2,FuelType.petrol);
		v[2]=new Bmw(2,FuelType.petrol,"jbl");
		v[3]=new Bmw(2,FuelType.petrol,"panasonic");
		v[4]=new Maruti(2,FuelType.petrol);
		DisplayVehicle.showVehicle(v);
	}

}
