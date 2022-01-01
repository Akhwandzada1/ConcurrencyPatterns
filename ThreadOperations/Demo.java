package ThreadOperations;

public class Demo {

	public static void main(String[] args) {
		MyRunnable r1=new MyRunnable("Suspendable Thread");
		r1.startThread();
		r1.suspendThread();
		try {
		Thread.sleep(4000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		r1.resumeThread();
		System.out.println("Exiting Main Thread");
	}
}