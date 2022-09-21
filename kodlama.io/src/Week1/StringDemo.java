package Week1;

public class StringDemo {



	public static void main(String[] args) {

		String message = "Today the weather is good.";
		System.out.println(message);
		System.out.println("Total number of elements in message: " + message.length());
		System.out.println("Fifth element: " + message.charAt(4));
		System.out.println(message.concat(" New message!!"));
		System.out.println(message);
		char[] characters = new char[5];
		message.getChars(0, 5, characters, 0);
		for (int i=0;i<characters.length;i++)
		{
			System.out.print(characters[i]+" ");
		}
		System.out.println("\n"+message.indexOf("w"));
	}

}
