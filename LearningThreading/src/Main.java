
public class Main {

	public static void main(String[] args) {
		System.out.println("Starting");
		NumbersTask task = new NumbersTask();
		Thread numbersThread = new Thread(task);
		numbersThread.start();
		Thread numbersThread2 = new Thread(task);
		numbersThread2.start();
		System.out.println("Finished");

	}
	
}
