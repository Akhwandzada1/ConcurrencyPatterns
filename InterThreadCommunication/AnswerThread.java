package InterThreadCommunication;

public class AnswerThread implements Runnable{
	Chat m;
	String[] s2= {"Hi","I am Good!, what about you?","Great! "};
	
	public AnswerThread(Chat m) {
		this.m=m;
		new Thread(this,"Answer Thread").start();
	}
	@Override
	public void run() {
		for(int i=0;i<s2.length;i++) {
			m.answer(s2[i]);
		}
	}
}
