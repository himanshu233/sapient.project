package day4.collection;

import java.util.HashSet;

class Device {
	private int dId;
	private String dName;
	private String dPrice;

	public Device(int dId, String dName, String dPrice) {
		super();
		this.dId = dId;
		this.dName = dName;
		this.dPrice = dPrice;
	}

	public int getdId() {
		return dId;
	}

	public void setdId(int dId) {
		this.dId = dId;
	}

	public String getdName() {
		return dName;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Device device = (Device) obj;
		if (this.dId == device.dId && this.dName.equals(device.dName) && this.dPrice.equals(device.dPrice)) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.dName.charAt(0);
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	public String getdPrice() {
		return dPrice;
	}

	public void setdPrice(String dPrice) {
		this.dPrice = dPrice;
	}
}

public class CollectionEx05 {
	public static void main(String[] args) {

		HashSet<Device> set = new HashSet<>();
		set.add(new Device(100, "laptop", "8646"));
		set.add(new Device(101, "laptop", "46"));
		set.add(new Device(102, "lop", "46"));
		set.add(new Device(103, "ltop", "8646"));
		set.add(new Device(104, "lapt", "8646"));
		set.add(new Device(100, "laptop", "8646"));
		for (Device d : set) {
			System.out.println(d.getdId());

		}

	}
}
