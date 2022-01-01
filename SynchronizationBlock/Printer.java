package SynchronizationBlock;

public class Printer {
	public void print() throws InterruptedException {
		long duration=(long) (Math.random()*10000);
		System.out.println(Thread.currentThread().getName()+" took "+duration/1000+" seconds to print the document.");
		Thread.sleep(duration);
		System.out.println(Thread.currentThread().getName()+ " printed the document successfully.");
	}
}
