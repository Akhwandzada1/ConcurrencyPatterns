package Locks;

public class MyRunnable implements Runnable {
	private Printer printer;
	
	public MyRunnable(Printer printer) {
		//Thread.currentThread().setName(threadName);
		this.printer=printer;
	}
	@Override
	public void run() {
		try {
			printer.print();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" is exiting after printing document successfully.");
		
	}
}
