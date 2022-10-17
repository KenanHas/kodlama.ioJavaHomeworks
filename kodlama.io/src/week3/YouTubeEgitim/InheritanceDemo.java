package week3.YouTubeEgitim;

public class InheritanceDemo {

	public static void main(String[] args) {
		CreditManager3 creditManager = new CreditManager3();
		creditManager.calculate();
		creditManager.save();

		Customer3 customer = new Customer3();

		customer.Id = 1;
		customer.city = "Ankara";

		CustomerManager3 customerManager = new CustomerManager3(customer);
		customerManager.save();

		Company company = new Company();
		company.taxNumber = "12234";
		company.companyName = "Arçelik";
		company.Id = 100;

		Person3 person = new Person3();
		person.nationalIdentity = "2";

		CustomerManager3 customerManager2 = new CustomerManager3(new Person3());
	}

}

class CreditManager3 {

	public void calculate() {
		System.out.println("Hesaplandı");
	}

	public void save() {
		System.out.println("Kredi verildi");
	}

}

class Customer3 {

	public int Id;
	public String city;

}

class CustomerManager3 {

	private Customer3 customer;

	public CustomerManager3(Customer3 customer) {
		this.customer = customer;
	}

	public void save() {
		System.out.println("Müşteri kaydedildi: ");
	}
}

class Company extends Customer3 {
	public String taxNumber;
	public String companyName;
}

class Person3 extends Customer3 {
	public String firstName;
	public String lastName;
	public String nationalIdentity;
}