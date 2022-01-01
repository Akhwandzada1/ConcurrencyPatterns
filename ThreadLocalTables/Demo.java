package ThreadLocalTables;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		Thread thread1=new Thread(new MyRunnable(5));
		Thread thread2=new Thread(new MyRunnable(7));
		thread1.start();
		thread2.start();
		thread1.join();
		thread2.join();

	}

}
