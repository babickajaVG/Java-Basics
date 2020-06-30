package unit04;

import java.util.Scanner;

public class task02 {
	public static void main(String arg[]) {

		int a = GetA();
		int b = GetB();
		int s = GetSFromConsole(a, b);
		int c = GetC(a, b);
		GetAnswer(c, s);
	}

	public static int GetSFromConsole(int a, int b) {// getSFromConsole - это Java, а не C#)
		System.out.println("Реши пример: " + a + " * " + b + " =");
		Scanner scs = new Scanner(System.in);
		int s = scs.nextInt();
		return s;
	}

	public static int GetC(int a, int b) {
		int c = a * b;
		return c;
	}

	public static int GetA() {
		int a = (int) (1 + Math.random() * 9);
		return a;
	}

	public static int GetB() {
		int b = (int) (1 + Math.random() * 9);
		return b;
	}

	public static void GetAnswer(int c, int s) {
		if (c == s) {
			System.out.println("у ти умничка");
		} else {
			System.out.println("все очень плохо, парень");
		}
	}

}
// задачи модуля 4 зачтены
