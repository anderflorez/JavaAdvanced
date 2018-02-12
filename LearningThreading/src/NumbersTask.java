
public class NumbersTask implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++ ) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
