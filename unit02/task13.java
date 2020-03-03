package unit02;

import java.util.Scanner;

public class task13 {
	public static void main(String arg[]) {

		System.out.println("enter number:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		if (num < 10) {
			System.out.println(+num);
		}

		if (num > 10) {
			int a = num % 10;
			num = num / 10;
			while (num > 0) {
				if (num % 10 > a) {
					a = num % 10;
				}
				num = num / 10;
			}
			System.out.println(+a);
		}

	}

}
