package SynchronizationBlock;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		Printer printer=new Printer();
		MyRunnable r1=new MyRunnable(printer);
		MyRunnable r2=new MyRunnable(printer);
		Thread t1=new Thread(r1,"Hamid");
		Thread t2=new Thread(r2,"Ahmed");
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("Exiting Main Method");
	}
}