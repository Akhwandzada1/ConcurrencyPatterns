package MutexPatternHomeWork;

public interface Lock {
	public void acquire() throws InterruptedException;
	public void release() throws InterruptedException;
}
