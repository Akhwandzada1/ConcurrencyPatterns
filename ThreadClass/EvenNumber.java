package ThreadClass;

public class EvenNumber extends Thread {
	@Override
	public void run() {
		try {
		for(int i=0;i<=100;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
