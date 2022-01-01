package ProducerConsumerPattern;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
	
	private BlockingQueue<Integer> shelf;
	
	public Producer(BlockingQueue<Integer> shelf) {
		this.shelf=shelf;
	}

	@Override
	public void run() {
		Random random=new Random();
		while(true) {
			try {
			long duration=(long) (Math.random()*10000);
			int orderNo=random.nextInt(100);
			System.out.println("Time taken to prepare order nr. "+orderNo+duration/1000+" seconds");
			Thread.sleep(duration);
			shelf.put(orderNo);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}