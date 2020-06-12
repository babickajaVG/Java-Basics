import java.util.Objects;

public class Book {
	
	private int price;
	private String author;
	private int year;
	
	public Book(int price, String author, int year) {
		this.price=price;
		this.author=author;
		this.year = year;
	}
	
	public void setPrice(int price) {
		this.price=price;
	}
	
	public int getPrice() {
		return price;
	}

	public void setAuthor(String author) {
		this.author=author;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setYear(int year) {
		this.year=year;
	}
	
	public int getYear() {
		return year;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book book = (Book) obj;
		
		if (author != book.author) {
			return false;
		}
		if (price != book.price) {
			return false;
		}
		if (year != book.year) {
			return false;
		}
		
		return true;
	}
    
	@Override
	public int hashCode() {
		return Objects.hash(author, price, year);
	}

	@Override
	public String toString() {
		return "Book: author=" + author + ", price=" + price + ", year=" + year;
	}

}
