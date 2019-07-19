package day3;
class BusinessLogic extends Thread{
	public void run() {
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
public class ThreadEx01 {
	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread().getName());
		BusinessLogic businessLogic =new BusinessLogic();
		BusinessLogic businessLogic2 =new BusinessLogic();
		businessLogic.setName("laptop");
		businessLogic2.setName("desktop");
		businessLogic2.setDaemon(true);
		businessLogic.start();
		businessLogic2.start();
		for(int i=0;i<100;i++)
		{
			System.out.println(Thread.currentThread().getName());
		}
		System.out.println("MAin exiting");
	}
}
