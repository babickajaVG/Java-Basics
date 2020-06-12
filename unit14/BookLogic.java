

import java.util.ArrayList;
import java.util.List;



public class BookLogic {

	private List<Book> books = new ArrayList<Book>();

	public BookLogic() {
	}

	public List<Book> getListOfBooks() {
		return books;
	}
	
	public void addBook(Book book) {
		books.add(book);
	}
	
	public boolean deleteBook(Book book) {
		return books.remove(book);
	}
	
	public Book findByAuthor(String content) {
		for (Book book : books) {
			if (book.getAuthor().equals(content)) {
				return book;
			}
		}
		return null;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((books == null) ? 0 : books.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BookLogic other = (BookLogic) obj;
		if (books == null) {
			if (other.books != null)
				return false;
		} else if (!books.equals(other.books))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "All books: " + books;
	}
	
}
