public class Main {

	public static void main(String[] args) {
		CustomerRecords records = new CustomerRecords();

		records.addCustomer(new Customer("John"));
		records.addCustomer(new Customer("Simon"));

		//records.getCustomers().clear();

		for (Customer next : records.getCustomers().values()) {
			System.out.println(next);
		}

		// getting a reference to one of the objects in the list
		Customer john = records.getCustomerByName("John");
		// check that we can use our reference to get the name of the customer object
		System.out.println(john.getName());
		// Changing the name of the customer
		john.setName("Derek");
		// checking the new name
		System.out.println(john.getName());

		// checking the original list was not changed or the previous changes were kept out of the original data
		System.out.println("\nChecking the list");
		for (Customer next : records.getCustomers().values()) {
			System.out.println(next);
		}

	}

}
