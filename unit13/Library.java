
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;
// задание защитано, но аккуратно с кодом
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
            reader.close();// close нужно вызывать в блоке finally
        }
        catch (Exception ex) {// просмотри еще раз объяснения по работе с исключениями, нужно перехватывать конкретные исключения
            ex.printStackTrace();// ну и ошибка кодирования - ты погасила исключение и пошла дальше выполнять код - как бы исключение ничего и не сотворило плохого
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
