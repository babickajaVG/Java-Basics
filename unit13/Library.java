
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;

public class Library {

	public static void main(String[] args) {
		BookLogic myBook = new BookLogic();

		String file = "C:\\Users\\Valeryia_Babitskaya\\eclipse-workspace\\unit13\\src\\Books.txt";	
	    String line = null;
	    try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            while ((line = reader.readLine()) != null) {
                String[] items = line.split(" ");
                myBook.addBook(new Book(Integer.parseInt(items[0]), items[1], Integer.parseInt(items[2])));
            }
            reader.close();
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }

		Book findBook = myBook.findByAuthor("Грибоедов");
		if (findBook != null) {
			System.out.print("Coincides with: ");
			System.out.println(findBook.toString());
			System.out.println();
		}
		
		
		System.out.println(myBook.toString());
	}
}
