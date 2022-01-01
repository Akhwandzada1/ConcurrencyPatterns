package Mutex;

import java.util.concurrent.Semaphore;

public class TableGenerator {
	Semaphore mutex;
	
	public TableGenerator(Semaphore mutex) {
		this.mutex=mutex;
	}
	public void generateTable(int number) {
		try {
			mutex.acquire();
			for(int i=1;i<=10;i++) {
				System.out.println(number+"x"+i+"="+number*i);
			}
			mutex.release();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}