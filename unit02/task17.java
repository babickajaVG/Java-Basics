package unit02;

import java.util.Scanner;

public class task17 {
	public static void main(String arg[]) {

		System.out.println("enter a:");
		Scanner sca = new Scanner(System.in);
		double a = sca.nextDouble();

		System.out.println("enter n:");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int N = n - 1;
		double m = N, i, sum, totalsum = 1;

		for (i = 1; i <= m; i++) {
			sum = a + i;
			totalsum = totalsum * sum;
		}
		System.out.println("TOTAL: " + totalsum * a);
	}

}
