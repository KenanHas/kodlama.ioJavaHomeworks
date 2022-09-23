package Week2;

//LESSON 33
public class SecondProductTest {

	public static void main(String[] args) {
		SecondProduct secondProduct = new SecondProduct();
		SecondProductManager secondProductManager = new SecondProductManager();

		secondProduct.setId(6);
		System.out.println(secondProduct.getId());

		secondProduct.setName("Laptop");
		System.out.println(secondProduct.getName());

		secondProduct.setDescription("Asus");
		System.out.println(secondProduct.getDescription());

		secondProduct.setPrice(8907);
		System.out.println(secondProduct.getPrice());

		secondProduct.setStockAmount(2);
		System.out.println(secondProduct.getStockAmount());

		secondProduct.setColor("red");
		System.out.println(secondProduct.getColor());

		System.out.println(secondProduct.getCode());

		secondProductManager.Add(secondProduct);
	}

}
