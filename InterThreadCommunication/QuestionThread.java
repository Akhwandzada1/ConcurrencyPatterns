package InterThreadCommunication;

public class QuestionThread implements Runnable {
	
	Chat m;
	String[] s1= {"Hi", "How are you","I am also doing fine!"};
	
	public QuestionThread(Chat m) {
		this.m=m;
		new Thread(this,"QuestionTherad").start();
	}
	@Override
	public void run() {
		for(int i=0;i<s1.length;i++) {
			m.question(s1[i]);
		}
		
	}
}
