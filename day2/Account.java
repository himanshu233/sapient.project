package day2;

import java.io.Serializable;

public class Account implements Serializable {
	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", customerName=" + customerName + ", initialBalance="
				+ initialBalance + "]";
	}
	private int accountId;
	private String customerName;
	private double initialBalance;
	static int count=100;
	public Account(String customerName,double initialBalance)
	{
		this.customerName=customerName;
		this.initialBalance=initialBalance;
		accountId=count++;
	}
	public int getAccountId() {
		return accountId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public double getInitialBalance() {
		return initialBalance;
	}
	public int getCount() {
		return count;
	}

}
