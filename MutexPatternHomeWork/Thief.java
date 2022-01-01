package MutexPatternHomeWork;

public class Thief extends Thread {
	private final String name;
	private final Jar jar;
	public Thief(String name, Jar jar) {
		this.jar=jar;
		this.name=name;
	}
	@Override
	public void run() {
		int beans=0;
		try {
			while(jar.takeBean()) {
				beans=beans+1;
				System.out.println(name+" took a bean.");
				
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(name+" took "+ beans+ " beans");
	}
	
}
