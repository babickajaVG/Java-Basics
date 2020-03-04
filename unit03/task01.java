
package unit03;

import java.util.Scanner;

public class task01 {
	public static void main(String arg[]) {
		System.out.print("Select source currency: \n" + "if USD - enter 1\n" + "if EUR - enter 2\n"
				+ "if BYN - enter 3\n" + "if RUB - enter 4");
		Scanner scA = new Scanner(System.in);
		int A = scA.nextInt();

		System.out.println("Enter conversion amount:");
		Scanner scs = new Scanner(System.in);
		int s = scs.nextInt();

		// A - исходная валюта, a - конечная валюта
		//s - сумма, которую надо конвертировать

		if (A == 1) {
			System.out
					.print("Choose a conversion currency:\n" + "EUR - enter 1\n" + "BYN - enter 2\n" + "RUB - enter 3");
			Scanner sca = new Scanner(System.in);
			int a = sca.nextInt();

			double e = 0.89;
			double b = 2.23;
			double r = 66;

			if (a == 1) {
				System.out.println("Converted amount is equal to " + s * e + " EUR");
			}
			if (a == 2) {
				System.out.println("Converted amount is equal to " + s * b + " BYN");
			}
			if (a == 3) {
				System.out.println("Converted amount is equal to " + s * r + " RUB");
			}
		}

		if (A == 2) {
			System.out
					.print("Choose a conversion currency:\n" + "USD - enter 1\n" + "BYN - enter 2\n" + "RUB - enter 3");
			Scanner sca = new Scanner(System.in);
			int a = sca.nextInt();

			double u = 1.112;
			double b = 2.48;
			double r = 73;

			if (a == 1) {
				System.out.println("Converted amount is equal to " + s * u + " USD");
			}
			if (a == 2) {
				System.out.println("Converted amount is equal to " + s * b + " BYN");
			}
			if (a == 3) {
				System.out.println("Converted amount is equal to " + s * r + " RUB");
			}
		}

		if (A == 3) {
			System.out
					.print("Choose a conversion currency:\n" + "USD - enter 1\n" + "EUR - enter 2\n" + "RUB - enter 3");
			Scanner sca = new Scanner(System.in);
			int a = sca.nextInt();

			double u = 0.447;
			double e = 0.40;
			double r = 29.6;

			if (a == 1) {
				System.out.println("Converted amount is equal to " + s * u + " USD");
			}
			if (a == 2) {
				System.out.println("Converted amount is equal to " + s * e + " EUR");
			}
			if (a == 3) {
				System.out.println("Converted amount is equal to " + s * r + " RUB");
			}
		}
		if (A == 4) {
			System.out
					.print("Choose a conversion currency:\n" + "USD - enter 1\n" + "EUR - enter 2\n" + "BYN - enter 3");
			Scanner sca = new Scanner(System.in);
			int a = sca.nextInt();

			double u = 0.0151;
			double e = 0.0135;
			double b = 0.0337;

			if (a == 1) {
				System.out.println("Converted amount is equal to " + s * u + " USD");
			}
			if (a == 2) {
				System.out.println("Converted amount is equal to " + s * e + " EUR");
			}
			if (a == 3) {
				System.out.println("Converted amount is equal to " + s * b + " BYN");
			}
		}

	}
}

	
