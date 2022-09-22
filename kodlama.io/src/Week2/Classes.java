package Week2;

public class Classes {

	public static void main(String[] args) {
		CustomerManager firstCustomer = new CustomerManager();
		
		firstCustomer.colour="red";
		firstCustomer.Add();
		firstCustomer.Remove();
		firstCustomer.Update();
		System.out.println("\n"+firstCustomer.colour);//colour variable is field or object variable
	}

}
