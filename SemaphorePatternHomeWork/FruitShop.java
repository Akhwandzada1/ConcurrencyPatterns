package SemaphorePatternHomeWork;

public class FruitShop {
	private final boolean[] available= {true,true,true};
	private final FruitBowl[] bowls= {new FruitBowl(),new FruitBowl(), new FruitBowl()};
	private final Semaphore semaphore;
	  public FruitShop() {
	    for (int i = 0; i < 100; i++) {
	      //bowls[0].put(new Fruit(Fruit.fruittype.APPLE));
	      //bowls[1].put(new Fruit(Fruit.fruittype.ORANGE));
	      //bowls[2].put(new Fruit(Fruit.fruittype.LEMON));
	    }

	    semaphore = new Semaphore(3);
	  }
	  public synchronized int countFruit() {
	    return bowls[0].countFruit() + bowls[1].countFruit() + bowls[2].countFruit();
	  }
	  public synchronized FruitBowl takeBowl() {
	    FruitBowl bowl = null;
	    try {
	      semaphore.acquire();
	      if (available[0]) {
	        bowl = bowls[0];
	        available[0] = false;
	      } else if (available[1]) {
	        bowl = bowls[1];
	        available[1] = false;
	      } else if (available[2]) {
	        bowl = bowls[2];
	        available[2] = false;
	      }
	    } catch (InterruptedException e) {
	      e.printStackTrace();
	    } finally {
	      semaphore.release();
	    }
	    return bowl;
	  }
	  public synchronized void returnBowl(FruitBowl bowl) {
	    if (bowl == bowls[0]) {
	      available[0] = true;
	    } else if (bowl == bowls[1]) {
	      available[1] = true;
	    } else if (bowl == bowls[2]) {
	      available[2] = true;
	    }
	  }
}