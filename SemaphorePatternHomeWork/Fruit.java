package SemaphorePatternHomeWork;

public class Fruit {
	FruitType fruittype;
	public Fruit(FruitType fruittype) {
		this.fruittype=fruittype;
	}
	public FruitType getFruitType() {
		return fruittype;
	}
	@Override
	public String toString() {
		return "Fruit [fruittype=" + fruittype + "]";
	}
	
}
