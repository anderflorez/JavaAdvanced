import java.util.Date;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CustomerManager {

	private List<Customer> customers = new CopyOnWriteArrayList<Customer>();
	private int nextId = 0;

	public  void addCustomer(Customer customer) {
		synchronized (this) {
			customer.setId(nextId);
			nextId++;
		}			
		customers.add(customer);
	}

	public void howManyCustomers() {
		int size = 0;
		size = customers.size();
		System.out.println("" + new Date() + " : " + size + " customers created");
	}
	
	/* If we don't add synchronization to the customers ArrayList then we will receive an exception as Java will not 
	 * allow to loop through an ArrayList while the ArrayList is being modified.
	 * But, if we add synchronization to the ArrayList any other thread will be stopped while we loop through the ArrayList
	 * 
	 * To solve this problem we will change the ArrayList to CopyOnWriteArrayList which is another type of collection
	 * that creates a copy of the array while writing to it, this way, it is possible to iterate the array as it
	 * will be static
	*/

	public void displayCustomers() {
		for (Customer c : customers) {
			System.out.println(c.toString());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
