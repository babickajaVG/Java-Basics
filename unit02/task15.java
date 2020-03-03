package unit02;

import java.util.Scanner;

public class task15 {
	public static void main(String arg[]) {

		System.out.println("enter a:");
		Scanner sca = new Scanner(System.in);
		int a = sca.nextInt();

		int c = 0;
		while (a > 0) {
			if ((a % 10) % 2 == 0) {
				c = c + 1;
			}
			a = a / 10;
		}
		if (c!=0) {
		System.out.println("кол-во четных цифр = "+c);
		}
		else {
			System.out.println("нет четных цифр");
		}
	}
}
