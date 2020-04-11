package unit04;

import java.util.Scanner;

class task03 {
	public static void main(String arg[]) {

		int A = GetAFromConsole();
		int s = GetsFromConsole();
		if (A == 1) {
			Count1(s);
		}
		if (A == 2) {
			Count2(s);
		}
		if (A == 3) {
			Count3(s);
		}

		if (A == 4) {
			Count4(s);
		}

	}

	public static int GetAFromConsole() {
		System.out.println(
				"Select source currency: \nif USD - enter 1\nif EUR - enter 2\nif BYN - enter 3\nif RUB - enter 4");
		Scanner scA = new Scanner(System.in);
		int A = scA.nextInt();
		return A; // A - исходная валюта
	}

	public static void Count1(int s) {
		double e = 0.89, b = 2.23, r = 66;

		selectCurrency("EUR", "BYN", "RUB");
		int a = GetaFromConsole();

		if (a == 1) {
			showResult(s * e, "EUR");
		}
		if (a == 2) {
			showResult(s * b, "BYN");
		}
		if (a == 3) {
			showResult(s * r, "RUB");
		}
	}

	public static void Count2(int s) {
		double u = 1.112, b = 2.48, r = 73;

		selectCurrency("USD", "BYN", "RUB");
		int a = GetaFromConsole();

		if (a == 1) {
			showResult(s * u, "USD");
		}
		if (a == 2) {
			showResult(s * b, "BYN");
		}
		if (a == 3) {
			showResult(s * r, "RUB");
		}
	}

	public static void Count3(int s) {
		double u = 0.447, e = 0.40, r = 29.6;
		selectCurrency("USD", "EUR", "RUB");
		int a = GetaFromConsole();

		if (a == 1) {
			showResult(s * u, "USD");
		}
		if (a == 2) {
			showResult(s * e, "EUR");
		}
		if (a == 3) {
			showResult(s * r, "RUB");
		}
	}

	public static void Count4(int s) {
		double u = 0.0151, e = 0.0135, b = 0.0337;

		selectCurrency("USD", "EUR", "BYN");
		int a = GetaFromConsole();

		if (a == 1) {
			showResult(s * u, "USD");
		}
		if (a == 2) {
			showResult(s * e, "EUR");
		}
		if (a == 3) {
			showResult(s * b, "BYN");
		}
	}

	public static int GetsFromConsole() {
		System.out.println("Enter conversion amount:");
		Scanner scs = new Scanner(System.in);
		int s = scs.nextInt();
		return s;// s - сумма, которую надо конвертировать
	}

	public static int GetaFromConsole() {
		Scanner sca = new Scanner(System.in);
		int a = sca.nextInt();
		return a;// a - валюта конверсии
	}

	private static void selectCurrency(String currency1, String currency2, String currency3) {
		System.out.println(String.format("Choose a conversion currency:\n%s- enter 1\n%s- enter 2\n%s- enter 3",
				currency1, currency2, currency3));
	}

	private static void showResult(double result, String currency) {
		System.out.println(String.format("Converted amount is equal to %.2f %s", result, currency));
	}
}
