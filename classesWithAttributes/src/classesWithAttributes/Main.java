package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product(1,"Laptop","Lenovo",3000,5,"blue");
		//product.setName("Laptop");
		//product.setId(1);
		//product.setDescription("Huaweı");
		//product.setPrice(50);
		//product.setStockAmount(5);
		
		
		
		//System.out.println(product.name);
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		System.out.println(product.getKod());

	}

}
