package EvenOddSemaphore;

import java.util.concurrent.Semaphore;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		Semaphore even=new Semaphore(0);
		Semaphore odd=new Semaphore(1);
		EvenNumber evenNumbers=new EvenNumber(even,odd);
		OddNumber oddNumbers=new OddNumber(even,odd);
		Thread evenThread=new Thread(evenNumbers,"Even-Number");
		Thread oddThread=new Thread(oddNumbers,"Odd-Number");
		System.out.println("Printing even & odd numbers upto 10 in sequence");
		evenThread.start();
		oddThread.start();
		evenThread.join();
		oddThread.join();
		

	}

}
