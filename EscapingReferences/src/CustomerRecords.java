import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CustomerRecords implements Iterable<Customer> {
	private Map<String, Customer> records;
	
	public CustomerRecords() {
		this.records = new HashMap<String, Customer>();
	}
	
	public void addCustomer(Customer c) {
		this.records.put(c.getName(), c);
	}
		
	public Map<String, Customer> getCustomers() {
		// By returning an unmodifiableMap or unmodifiableList instead of the actual map
		// we prevent the reference from escaping
		return Collections.unmodifiableMap(this.records);
		
		// if we had returned the actual map it actually contains a reference to the original map 
		// which can then be modified from anywhere else in the code
		// that goes against the java encapsulation principle
	}

	@Override
	public Iterator<Customer> iterator() {
		
		return records.values().iterator();
	}
	
	public Customer getCustomerByName(String name) {
		// This next line of code actually provides an escaping reference to the customer object
		// allowing the client to call any of the customer mutator methods that will change the object attributes 
		return this.records.get(name);
		
	}
}
