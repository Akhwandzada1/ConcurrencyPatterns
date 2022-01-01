package ThreadLocal;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		MyRunnable r1=new MyRunnable();
		Thread thread1=new Thread(r1);
		Thread thread2=new Thread(r1);
		Thread thread3=new Thread(r1);
		Thread thread4=new Thread(r1);
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread1.join();
		thread2.join();
		thread3.join();
		thread4.join();
		System.out.println("Exiting main thread....");
	}
}