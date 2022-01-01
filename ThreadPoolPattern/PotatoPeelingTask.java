package ThreadPoolPattern;

public class PotatoPeelingTask extends Task {
	
	private final static int TIME_PER_POTATO=200;

	public PotatoPeelingTask(int potatoes) {
		super(potatoes*TIME_PER_POTATO);
	}

	@Override
	public String toString() {
		return String.format("%s %s",this.getClass().getSimpleName(),super.toString());
	}
}