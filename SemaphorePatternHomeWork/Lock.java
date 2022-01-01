package SemaphorePatternHomeWork;

public interface Lock {
	public void acquire() throws InterruptedException;
	public void release();
}
