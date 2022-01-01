package ProducerConsumerPattern;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
	private BlockingQueue<Integer> shelf;
	
	public Consumer(BlockingQueue<Integer> shelf) {
		this.shelf=shelf;
	}
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1500);
				Random random=new Random();
				if(random.nextInt(10)==0) {
					int value = shelf.take();
					System.out.println(Thread.currentThread().getName() +": serving order nr. "+ value+ ". There are "+ shelf.size()+" unserved orders on the shelf");
				}
				
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
