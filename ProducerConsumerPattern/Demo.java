package ProducerConsumerPattern;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Demo {
	public static void main(String[] args) {
		
	BlockingQueue<Integer> shelf = new ArrayBlockingQueue<Integer>(3);

	Producer cook = new Producer(shelf);
	Consumer waiter = new Consumer(shelf);

	Thread c = new Thread(cook, "Cook");
	Thread waiter1 = new Thread(waiter, "Waiter 1");
	Thread waiter2 = new Thread(waiter, "Waiter 2");
	

	c.start();
	waiter1.start();
	waiter2.start();
	// wait for threads to end
	try {
		c.join();
		waiter1.join();
		waiter2.join();
	} catch (Exception e) {
		System.out.println("Main thread is interrupted");
	}
}
}
