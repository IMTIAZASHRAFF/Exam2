package Q25;

public class Main {

	public static void main(String[] args) {
		/*Create a interface called fruit with 2 methods isSweet and isPoisonous. 
		 * Create 2 classes called Apple and PoisonBerry which implement this interface and 
		 * override the methods. 
		 * Create a Main Method to create objects for apple & PoisonBerry to get the result
		 */
                 Apple ali = new Apple();
                 Poisonberry dar = new Poisonberry();
                 ali.isSweet();
                 ali.isPoisonous();
                 dar.isSweet();
                 dar.isPoisonous();
	}

}
