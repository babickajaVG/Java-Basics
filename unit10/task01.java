package unit10;

public class task01 {

	public static void main(String[] args) {
		
		task01Customer customer1 = new task01Customer(13, "babitskaya", "lera", "hennad", "minsk", 1414, 1818);
		task01Customer customer2 = new task01Customer(14, "vabitskaya", "lera", "gennad", "minsk", 1413, 1818);
		
		System.out.println("Customer");
		if (customer1.equals(customer2)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		System.out.println(customer1.hashCode());
		System.out.println(customer2.hashCode());
		System.out.println();
		
		
		task01Student student1= new task01Student(13, "babitskaya", "lera", "hennad", "2011-11-11", "minsk", 233-33-33, "MMF", 5);
		task01Student student2= new task01Student(13, "babitskaya", "lera", "hennad", "2011-11-11", "minsk", 233-33-33, "MMF", 5);
		
		System.out.println("Student");
		if (student1.equals(student2)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		System.out.println(student1.hashCode());
		System.out.println(student2.hashCode());

	}

}
