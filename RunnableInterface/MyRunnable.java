package RunnableInterface;

public class MyRunnable implements Runnable{
	private String threadName;
	private Thread thread;
	public MyRunnable(String threadName) {
		this.threadName=threadName;
		System.out.println("Creating "+ threadName);
	}
	@Override
	public void run() {
		System.out.println("Running "+ threadName);
		try {
			for(int i=0;i<=100;i++) {
				if(i%2!=0) {
					System.out.println(i);
					Thread.sleep(4000);
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Exiting "+threadName);
	}
	public void startThread() {
		System.out.println("Starting "+threadName);
		if(thread==null) {
			thread=new Thread(this,threadName);
			thread.start();
		}
	}
	
}