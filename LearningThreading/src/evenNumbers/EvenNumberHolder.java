package evenNumbers;

public class EvenNumberHolder {
	
	private int currentEven = 0;
	
	public int getNextEven() {
		synchronized (this) {
			currentEven += 2;		
		}
		return currentEven;
	}

}
