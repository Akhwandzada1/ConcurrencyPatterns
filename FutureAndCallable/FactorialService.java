package FutureAndCallable;

import java.util.concurrent.Callable;

public class FactorialService implements Callable<Long>{
	
	private int number;
	public FactorialService(int number) {
		this.number=number;
	}
	@Override
	public Long call() throws Exception {
		// TODO Auto-generated method stub
		return factorial();
	}
	private long factorial() throws InterruptedException {
		long result=1;
		while(number!=0) {
			result=result*number;
			number--;
			Thread.sleep(100);
		}
		return result;
	}
}