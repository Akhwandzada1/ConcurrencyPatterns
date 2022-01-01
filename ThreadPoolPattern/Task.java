package ThreadPoolPattern;

import java.util.concurrent.atomic.AtomicInteger;

public abstract class Task {
	private final AtomicInteger ID_GENERATOR=new AtomicInteger();
	private final int id;
	private final int timeMs;
	
	public Task(final int timeMs) {
		this.id=ID_GENERATOR.incrementAndGet();
		this.timeMs=timeMs;
	}
	public int getID() {
		return id;
	}
	public int getTimeMs() {
		return timeMs;
	}
	@Override
	public String toString() {
		return String.format("id= %d time(Ms)= %d", id,timeMs);
	}
}