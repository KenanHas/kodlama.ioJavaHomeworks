package week3.YouTubeEgitim;

public class ConstructorDemo {

	public static void main(String[] args) {
		CreditManager2 creditManager = new CreditManager2();
		creditManager.calculate();
		creditManager.save();

		Customer2 customer = new Customer2();

		customer.firstName = "Engin";
		customer.Id = 1;
		customer.lastName = "Demiroğ";
		customer.nationalIdentity = "1234356";
		customer.city="Ankara";
		
		CustomerManager2 customerManager = new CustomerManager2(customer);
		customerManager.save();
	}

}
class CreditManager2 {

	public void calculate() {
		System.out.println("Hesaplandı");
	}

	public void save() {
		System.out.println("Kredi verildi");
	}

}

class Customer2 {

	public int Id;
	public String firstName;
	public String lastName;
	public String nationalIdentity;
	public String city;

}

class CustomerManager2 {

	private Customer2 customer;
	
	public CustomerManager2(Customer2 customer)
	{
		this.customer=customer;
	}
	public void save()
	{
		System.out.println("Müşteri kaydedildi: "+customer.firstName);
	}
}