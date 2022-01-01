package MutexPatternHomeWork;

public class Jar {
	private int beans;
	private final Lock lock;
	public Jar(final Lock lock, int beans) {
		this.beans=beans;
		this.lock=lock;
	}
	public boolean takeBean() throws InterruptedException {
		boolean success=false;
		try {
			lock.acquire();
			success=beans>0;
			if(success) {
				beans=beans-1;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			lock.release();
		}
		return success;
	}

}
