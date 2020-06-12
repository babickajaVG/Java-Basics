/*Задания для развития и закрепления навыков 1
 
1. Опишите класс, реализующий десятичный счетчик, 
который может увеличивать или уменьшать свое значение на единицу в заданном диапазоне. 
Предусмотрите инициализацию счетчика значениями по умолчанию и произвольными значениями. 
Счетчик имеет методы увеличения и уменьшения состояния, 
и метод позволяющее получить его текущее состояние. 
Написать код, демонстрирующий все возможности класса. */

package unit08;

import java.util.Scanner;

public class CounterMain {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Will the initial value of the counter be set? \nYES(press 1) \nNO(press0)");
		int answer = sc.nextInt();

		Counter value = null;

		if (answer == 1) { // initialization of the counter with arbitrary values
			System.out.println("enter initial value of the counter:  ");
			int n = sc.nextInt();
			value = new Counter(n);
		}

		if (answer == 0) { // initialization of the counter with default values (15)
			value = new Counter();
		}

		System.out.println("enter lower end of range: "); // set lower end of range
		int lowerEnd = sc.nextInt();

		System.out.println("enter upper end of range: "); // set upper end of range
		int upperEnd = sc.nextInt();

		value.getCurrentValue(); // get current counter value

		
		value = value.increaseValue(lowerEnd, upperEnd); // increase the current counter value by 1
		System.out.print("after increasing ");
		value.getCurrentValue(); // print increased value
		
		value = value.decreaseValue(lowerEnd, upperEnd); // decrease the current counter value by 1
		System.out.print("after decreasing ");
		value.getCurrentValue(); // print decreased value
		

	}

}
