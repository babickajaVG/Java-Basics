package unit11;

import java.util.List;

public class Order {

	public static void main(String[] args) {
		Payment myPayment = new Payment();
		
		myPayment.addProduct(new Product (140, "bread"));
		myPayment.addProduct(new Product (150, "milk"));
		myPayment.addProduct(new Product (160, "becon"));
		
		print(myPayment);

	}
	
	public static void print(Payment payment) {
		List<Product> printPayments = payment.getListOfProducts();
		System.out.println("Order: ");
		for (int i = 0; i < printPayments.size(); i++) {
			Product product = printPayments.get(i);
			print(product);
		}
	}
	
	public static void print(Product product) {
		System.out.println("Product: '" + product.getName() + "' costs: " + product.getPrice() + "$");
	}

}
