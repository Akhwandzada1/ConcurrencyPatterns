package Locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Printer {
	private final Lock printqueuelock=new ReentrantLock();
	public void print() throws InterruptedException {
		printqueuelock.lock();
		long duration=(long) (Math.random()*10000);
		System.out.println(Thread.currentThread().getName()+ " took "+duration/1000+" seconds to print the document");
		Thread.sleep(duration);
		System.out.println(Thread.currentThread().getName()+" printed the document successfully");
		printqueuelock.unlock();
	}
}
