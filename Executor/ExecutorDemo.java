package Executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorDemo {

	public static void main(String[] args) {
		
		ExecutorService executorService=Executors.newSingleThreadExecutor();
		executorService.execute(new Task());
		executorService.shutdown();

	}
	static class Task implements Runnable{
		@Override
		public void run() {
			try {
				long duration=(long) (Math.random()*5);
				System.out.println("Running Task !");
				TimeUnit.SECONDS.sleep(duration);
				System.out.println("Task Completed.");
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}

}
