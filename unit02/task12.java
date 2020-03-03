package unit02;

import java.util.Scanner;

public class task12 {
	public static void main(String arg[]) {

		System.out.println("enter string");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		String a = str.substring(0, 1);

		if (a.matches("[a-zA-Z_]")) {
			if (str.matches("[a-zA-Z0-9_]+")) {				
				System.out.println("good");
				
			} else {
				System.out.println("gg");
			}

		} else {
			System.out.println("error!error!");
		}

	}
}
