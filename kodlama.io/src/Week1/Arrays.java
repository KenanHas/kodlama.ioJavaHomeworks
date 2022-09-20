package Week1;

public class Arrays {

	public static void main(String[] args) {
		
		String[] students = new String[4];
		
		students[0]="Ali";
		students[1]="Fatih";
		students[2]="Cemre";
		students[3]="Kenan";
		
		for(int i=0;i<students.length;i++)
		{
			System.out.println(students[i]);
		}
		System.out.println("\nSecond way\n");	
		// for each

		for(String student:students)
		{
			System.out.println(student);
		}
	}

}
