package day3;
class someclass{
	
}
class MyBusinessLogic extends someclass implements Runnable{
	private String name;
	private int priority;
	Thread t;

	public MyBusinessLogic(String name, int priority) {
		t=new Thread(this);
		t.setName(name);
		t.setPriority(priority);
		t.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<100;i++)
		{
		System.out.println(Thread.currentThread().getName());
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		System.out.println(Thread.currentThread().getName()+"exiting");
		
	}
	
}
public class ThreadEx02 {
	public static void main(String[] args) throws InterruptedException{
		MyBusinessLogic x=new MyBusinessLogic("lap", 1);
		MyBusinessLogic x1=new MyBusinessLogic("des",2);
		for(int i=0;i<100;i++)
		{
			System.out.println(Thread.currentThread().getName());
		}
		x.t.join();
		x1.t.join();
		System.out.println("MAin exiting");
	}

}
