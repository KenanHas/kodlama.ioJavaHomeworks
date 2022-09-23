package Week2.Inheritance;
//LESSON 36
public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer();
		Employee employee = new Employee();
		CustomerManager customerManager = new CustomerManager();
		EmployeeManager employeeManager = new EmployeeManager();
		
		customer.age = 12;
		System.out.println(customer.age);
		employee.age=24;
		System.out.println(employee.age);
		System.out.println("\nInheritance in methods:");
		
		customerManager.Add();
		customerManager.List();
		employeeManager.Add();
		employeeManager.List();
		employeeManager.BestEmployee();
		
	}

}
