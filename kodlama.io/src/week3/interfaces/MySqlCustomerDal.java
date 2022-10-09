package week3.interfaces;

public class MySqlCustomerDal implements ICustomerDal,IRepository{

	public void add() {
		System.out.println("My sql eklendi.");
		
	}
}
