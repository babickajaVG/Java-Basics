
import java.util.List;

public class Library {

	public static void main(String[] args) {
		BookLogic myBook = new BookLogic();

		Book first = new Book(140, "Грибоедов", 2000);
		Book second = new Book(150, "Пушкин", 1995);
		Book third = new Book(160, "Толстой", 2005);

		myBook.addBook(first);
		myBook.addBook(second);
		myBook.addBook(third);

		System.out.println(myBook.toString());
		System.out.println();

		Book findBook = myBook.findByAuthor("Толстой");
		if (findBook != null) {
			System.out.print("Coincides with: ");
			System.out.println(findBook.toString());
			System.out.println();
		}
		
		myBook.deleteBook(second);
		System.out.println(myBook.toString());
	}
}
