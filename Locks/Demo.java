package Locks;

public class Demo {

	public static void main(String[] args) {
		Printer printer=new Printer();
		MyRunnable r1=new MyRunnable(printer);
		MyRunnable r2=new MyRunnable(printer);
		MyRunnable r3=new MyRunnable(printer);
		Thread t1=new Thread(r1,"Hamid");
		Thread t2=new Thread(r2, "Ali");
		Thread t3=new Thread(r3,"Shoaib");
		t1.start();
		t2.start();
		t3.start();
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}