package Mutex;

import java.util.concurrent.Semaphore;

public class Demo {

	public static void main(String[] args) {
		Semaphore mutex=new Semaphore(1);
		TableGenerator tableGenerator=new TableGenerator(mutex);
		Thread table5=new Thread(new Runnable() {

			@Override
			public void run() {
				tableGenerator.generateTable(5);				
			}
		});
		Thread table8=new Thread(new Runnable() {

			@Override
			public void run() {
				tableGenerator.generateTable(8);
			}
			
		});
		table5.start();
		table8.start();

	}

}
