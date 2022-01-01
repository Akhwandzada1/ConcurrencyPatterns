package CountingSemaphore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo {

	public static void main(String[] args) {
		ExecutorService executorService=Executors.newFixedThreadPool(200);
		for(int i=0;i<=200;i++) {
			executorService.submit(new Runnable() {
				@Override
				public void run() {
						try {
							Connection.getInstance().Connect();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}			
				}
				
			});
		}
		executorService.shutdown();
	}
}