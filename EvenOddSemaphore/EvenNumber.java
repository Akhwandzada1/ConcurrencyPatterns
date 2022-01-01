package EvenOddSemaphore;

import java.util.concurrent.Semaphore;

public class EvenNumber implements Runnable {
	Semaphore even;
	Semaphore odd;
	
	public EvenNumber(Semaphore even, Semaphore odd) {
		this.even=even;
		this.odd=odd;
	}
	@Override
	public void run() {
		for(int i=2;i<=10;i=i+2) {
			try {
				even.acquire();
				Thread.sleep(1000);
				System.out.println(i);
				odd.release();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
