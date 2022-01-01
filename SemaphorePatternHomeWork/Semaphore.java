package SemaphorePatternHomeWork;

public class Semaphore implements Lock {
	
	private final int licenses;
	private int counter;
	public Semaphore(int licenses) {
		this.licenses=licenses;
		this.counter=licenses;
	}
	public int getNumLicenses() {
		return licenses;
	}
	public int getAvaliableLicenses(){
		return counter;
	}
	@Override
	public synchronized void acquire() throws InterruptedException {
		if(counter==0) {
			wait();
		}
		counter--;
	}
	@Override
	public synchronized void release() {
		if(counter<licenses) {
			counter++;
			notify();
		}
	}
}