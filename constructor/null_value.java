class Customer {
	public String customerId;
	public String customerName;
	public long contactNumber;
	public String address;
}
public class Tester {
	public static void main(String args[]) {
		Customer customer1 = new Customer();
		System.out.println(customer1.customerId);
		System.out.println(customer1.customerName);
		System.out.println(customer1.contactNumber);
                System.out.println(customer1.address);
	}
}
