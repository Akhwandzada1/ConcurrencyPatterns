package MutexPatternHomeWork;

public class Demo {
	public static void main(String[] args) {
		Mutex mutex = new Mutex();
	    Jar jar = new Jar(mutex, 100);
	    Thief peter = new Thief("Peter", jar);
	    Thief john = new Thief("John", jar);
	    peter.start();
	    john.start();

	}
}
