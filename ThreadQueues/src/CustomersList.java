import java.util.ArrayList;
import java.util.List;


public class CustomersList {

	private List<Customer> customers = new ArrayList<Customer>();

	public void addToList(Customer customer) {
		synchronized (this) {
			customers.add(customer);
			notifyAll();
		}
	}

	public Customer getFromList() {
		synchronized (this) {
			while (customers.size() ==0) {
				try {
					wait();
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			return customers.remove(0);
		}
	}
}
