
public class NumbersTask implements Runnable {

//	@Override
//	public void run() {
//		for (int i = 1; i <= 10; i++ ) {
//			System.out.println(i);
//			try {
//				int randomDelay = (int) (Math.random() * 500 + 1);
//				Thread.sleep(randomDelay);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//		System.out.println("Task " + Thread.currentThread().getName() + " has finished");
//
//	}
	
	private void longRunningMethod() throws InterruptedException {
		System.out.println("Starting long method");
		Double j = 1.01;
		for (long l = 1; l < 1000l; l++ ) {
			j+=1.01;
			if (Thread.interrupted()) {
				throw new InterruptedException();
			}
		}
		System.out.println("Ending long method");
	}
	
	// Method created for the chapter Thread Process Flow
	@Override
	public void run() {
		for (int i = 1; i <= 1000; i++ ) {
			System.out.println("Task number " + Thread.currentThread().getName() + " is outputing number " + i);
			try {
				longRunningMethod();
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
			if (Thread.interrupted() ) {
				break;
			}
		}
		System.out.println("Task " + Thread.currentThread().getName() + " has finished");

	}

}
