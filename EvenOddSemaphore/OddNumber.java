package EvenOddSemaphore;

import java.util.concurrent.Semaphore;

public class OddNumber implements Runnable {
	Semaphore even;
	Semaphore odd;	
	public OddNumber(Semaphore even, Semaphore odd) {
		this.even=even;
		this.odd=odd;
	}
	@Override
	public void run() {
		for(int i=1;i<=10;i=i+2) {
			try {
				odd.acquire();
				Thread.sleep(1000);
				System.out.println(i);
				even.release();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}