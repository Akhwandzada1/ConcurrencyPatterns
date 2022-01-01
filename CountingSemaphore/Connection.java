package CountingSemaphore;

import java.util.concurrent.Semaphore;

public class Connection {
	private static Connection instance=new Connection();
	private Semaphore sem=new Semaphore(10);
	int numberOfConnections=10;
	int currentnumberOfConnections=0;
	private Connection(){
		
	}
	public static Connection getInstance() {
		return instance;
	}
	public void Connect() throws InterruptedException {
		
		sem.acquire();
		numberOfConnections--;
		currentnumberOfConnections++;
		Thread.sleep(1000);
		System.out.println("Current number of connections "+currentnumberOfConnections);
		System.out.println("Number of connections avaliable "+numberOfConnections);
		numberOfConnections++;
		currentnumberOfConnections--;
		System.out.println("Releasing Connection... Number of connections avaliable now: "+numberOfConnections+" Number of current connections now: "+currentnumberOfConnections);
		sem.release();
	}
	
}
