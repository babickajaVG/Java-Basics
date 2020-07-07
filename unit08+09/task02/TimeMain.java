/*2. Составьте описание класса для представления времени. 
 * Предусмотрте возможности установки времени и 
 * изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. 
 * В случае недопустимых значений полей поле устанавливается в значение 0. 
 * Создать методы изменения времени на заданное количество часов, минут и секунд.*/


package unit08;

import java.util.Scanner;

public class TimeMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		System.out.println("enter hours: ");
		int h = sc.nextInt();
		
		System.out.println("enter minutes: ");
		int m = sc.nextInt();
		
		System.out.println("enter seconds: ");
		int s = sc.nextInt();
	
		Time time = new Time(h, m, s);
		
		time.checkTime();
		time.printTime();

		time=time.changeH();
		time.printTime();
		time= time.changeM();
		time.printTime();
		time= time.changeS();
		time.printTime();
	}
	

	
	

}
// Задачи юнитов 8-9 решены без существенных ошибок
