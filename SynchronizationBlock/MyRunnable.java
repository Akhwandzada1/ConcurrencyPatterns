package SynchronizationBlock;

public class MyRunnable implements Runnable {
	private Printer printer;
	
	public MyRunnable(Printer printer) {
		//Thread.currentThread().setName(threadName);
		this.printer=printer;
	}
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+ " starts printing a document.");
		synchronized(printer) {
			try {
				printer.print();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+ " is exiting.");
		
	}
}
