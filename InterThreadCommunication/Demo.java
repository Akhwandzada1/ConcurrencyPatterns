package InterThreadCommunication;

public class Demo {

	public static void main(String[] args) {
		Chat m=new Chat();
		new QuestionThread(m);
		new AnswerThread(m);

	}

}
