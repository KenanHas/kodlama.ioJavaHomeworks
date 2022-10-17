package week3.YouTubeEgitim;

public class ClassDemo {

	public static void main(String[] args) {

		CreditManager creditManager = new CreditManager();
		creditManager.calculate();
		creditManager.save();

		Customer customer = new Customer();

		customer.firstName = "Engin";
		customer.Id = 1;
		customer.lastName = "Demiroğ";
		customer.nationalIdentity = "1234356";
		customer.city="Ankara";
		
		CustomerManager customerManager = new CustomerManager();
		customerManager.save(customer);
		
	}

}

class CreditManager {

	public void calculate() {
		System.out.println("Hesaplandı");
	}

	public void save() {
		System.out.println("Kredi verildi");
	}

}

class Customer {

	public int Id;
	public String firstName;
	public String lastName;
	public String nationalIdentity;
	public String city;

}

class CustomerManager {
	public void save(Customer customer)
	{
		System.out.println("Müşteri kaydedildi.");
	}
}