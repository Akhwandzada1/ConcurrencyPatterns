package ThreadPoolPattern;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo {

	public static void main(String[] args) {
		ArrayList<Task> tasks=new ArrayList<Task>();
		tasks.add(new PotatoPeelingTask(4));
		tasks.add(new CoffeeMakingTask(100));
		tasks.add(new PotatoPeelingTask(600));
		tasks.add(new CoffeeMakingTask(80));
		tasks.add(new PotatoPeelingTask(82));
		ExecutorService executorService=Executors.newFixedThreadPool(3);
		for(Task t:tasks) {
			executorService.submit(new Worker(t));
		}
		executorService.shutdown();
		while(!executorService.isTerminated()) {
			Thread.yield();
		}
		System.out.println("Exiting main thread");
	}
}