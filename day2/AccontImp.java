package day2;

public class AccontImp {
	public static void main(String[] args) {
		Account a1=new Account("sdag", 256456);
		Account a2=new Account("kikj", 54534564);
		System.out.println(a1.getAccountId()+" "+a1.getCustomerName()+" "+a1.getInitialBalance());
		System.out.println(a2.getAccountId()+" "+a2.getCustomerName()+" "+a2.getInitialBalance());
	}

}
