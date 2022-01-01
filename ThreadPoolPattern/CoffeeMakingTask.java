package ThreadPoolPattern;

public class CoffeeMakingTask extends Task{
	
	private static final int TIME_PER_CUP=100;

	public CoffeeMakingTask(int cups) {
		super(cups*TIME_PER_CUP);
	}
	@Override
	public String toString() {
		return String.format("%s %s",this.getClass().getSimpleName(),super.toString());
	}
}