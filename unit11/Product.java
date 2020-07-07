package unit11;

public class Product {// а куда пропали изученные методы equals и hashCode? не использозвать их и далее добавлять объекты в коллекцию - ошибка
	private int price;
	private String name;
	
	public Product(int price, String name) {
		this.price=price;
		this.name=name;
	}
	
	public void setPrice(int price) {
		this.price=price;
	}
	
	public int getPrice() {
		return price;
	}

	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return "Name [name=" + name + ", price=" + price + "]";
	}

}
