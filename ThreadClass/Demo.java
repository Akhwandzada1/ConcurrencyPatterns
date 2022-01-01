package ThreadClass;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		Thread thread=new EvenNumber();
		thread.start();
		thread.join();
		System.out.println("Main Thread Ended");
	}
}