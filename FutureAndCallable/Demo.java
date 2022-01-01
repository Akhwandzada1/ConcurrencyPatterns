package FutureAndCallable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Demo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService=Executors.newSingleThreadExecutor();
		System.out.println("Factorial Service called for 10!");
		Future<Long> result10=executorService.submit(new FactorialService(10));
		System.out.println("Factorial Service called for 20!");
		Future<Long> result20=executorService.submit(new FactorialService(20));
		long factorial10=result10.get();
		System.out.println("10!= "+factorial10);
		long factorial20=result20.get();
		System.out.println("20!= "+factorial20);
		executorService.shutdown();
		

	}

}
