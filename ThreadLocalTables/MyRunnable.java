package ThreadLocalTables;

public class MyRunnable implements Runnable {
	ThreadLocal<Integer> threadLocal=new ThreadLocal<Integer>();
	int number=0;
	public MyRunnable(int number) {
		this.number=number;
		threadLocal.set(number);
	}
	@Override
	public void run() {
		try {
			for(int i=1;i<11;i++) {
				System.out.println("Table of "+threadLocal.get()+threadLocal.get().intValue()*i);
				Thread.sleep(300);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}