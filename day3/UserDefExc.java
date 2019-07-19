package day3;
class Customer{
	public Customer(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}
	private String name;
	private String email;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
public class UserDefExc {
	public static void main(String[] args) {
		Customer customer=new Customer("Hi","hsr@gmail.com");
		try {
			perTran(customer, 50);
		} catch (NameTooSmallException e) {
			e.getMessage();
			e.printStackTrace();
		}
	}
		int amount =100;
		public static void perTran(Customer customer,int amount) throws NameTooSmallException {
			if(customer.getName().length() < 3) {
				throw new NameTooSmallException("sorry name has only "+customer.getName().length()+" letters");
				
			}
			
		}
	

}
