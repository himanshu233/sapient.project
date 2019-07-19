package day3;

public class ExceptionExample1 {
	public static void main(String[] args) {
		try {
		int n1=Integer.parseInt(args[0]);
		int n2=8;
		
		System.out.println("Result of divide is "+(n1/n2));
		}catch(ArithmeticException ae)
		{
			System.out.println(ae);
			ae.printStackTrace();
		}catch(NumberFormatException nfe) {
			nfe.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException aiob) {
			System.out.println("Array index out of bound exception");
		}
		System.out.println("---------------++++++------------");
	}

}
