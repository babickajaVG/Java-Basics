package unit11;

import java.util.ArrayList;
import java.util.List;

public class Payment {

	private List<Product> products = new ArrayList<Product>();

	public Payment() {
	}

	public List<Product> getListOfProducts() {
		return products;
	}
	
	public void addProduct(Product product) {
		products.add(product);
	}
	
	
	
}
// задания модуля не зачтены, т.к. содержат грубую ошибку
