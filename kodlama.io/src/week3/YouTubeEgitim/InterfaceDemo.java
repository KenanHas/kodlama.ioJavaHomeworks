package week3.YouTubeEgitim;

public class InterfaceDemo {

	public static void Main(String[] args)

	{
		CustomerManager4 customerManager = new CustomerManager4(new Customer4(),new MilitaryCreditManager());
		customerManager.GiveCredit();
	
	}
}

class CreditManager4 {

	public void calculate() {
		System.out.println("Hesaplandı");
	}

	public void save() {
		System.out.println("Kredi verildi");
	}

	
}

interface ICreditManager {
	void calculate();
	void save();
}

class TeacherCreditManager implements ICreditManager {
	public void calculate() {
		System.out.println("Öğretmen kredisi hesaplandı.");
	}

	public void save() {

	}
}

class MilitaryCreditManager implements ICreditManager {
	public void calculate() {
		System.out.println("Asker kredisi hesaplandı.");
	}

	public void save() {

	}
}

class Customer4 {

	public int Id;
	public String city;

}

class CustomerManager4 {

	private Customer4 customer;
	private ICreditManager creditManager;
	
	public CustomerManager4(Customer4 customer,ICreditManager creditManager) {
		this.customer = customer;
		this.creditManager=creditManager;
	}

	public void save() {
		System.out.println("Müşteri kaydedildi: ");
	}
	public void GiveCredit()
	{
		creditManager.calculate();
		System.out.println("Kredi verildi");
	}	
}

class Company2 extends Customer4 {
	public String taxNumber;
	public String companyName;
}

class Person4 extends Customer4 {
	public String firstName;
	public String lastName;
	public String nationalIdentity;
}