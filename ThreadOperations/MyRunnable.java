package ThreadOperations;

public class MyRunnable implements Runnable {
	private boolean suspended=false;
	private String threadName;
	private Thread thread;
	
	public MyRunnable(String threadName) {
		this.threadName=threadName;
		System.out.println("Creating "+threadName);
	}

	@Override
	public void run() {
		System.out.println("Running "+threadName);
		try {
			for(int i=10;i>0;i--) {
				System.out.println(i);
				Thread.sleep(500);
				synchronized(this) {
					while(suspended) {
						wait();
					}
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void startThread() {
		System.out.println("Starting "+threadName);
		if(thread==null) {
			thread=new Thread(this,threadName);
			thread.start();
		}	
	}
	public void suspendThread() {
		suspended=true;
	}
	public synchronized void resumeThread() {
		suspended=false;
		notify();
	}
}