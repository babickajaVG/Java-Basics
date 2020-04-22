package unit06;

import java.util.Scanner;

public class task01 {
	public static void main(String[] arg) {

		int n = GetArrayLength();
		int mas[][] = new int[n][n];
		GetArray(mas, n);
	}

	public static int GetArrayLength() {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter array length: ");
		while (!scn.hasNextInt()) {
			scn.next();
			System.out.println("Enter array length: ");
		}
		int n = scn.nextInt();
		if (n%2!=0) {
			System.out.println("Enter array length: ");
			 n = scn.nextInt();
		}
		return n;
	}

	public static void GetArray(int mas[][], int n) {
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas.length; j++) {
				if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
					mas[i][j] = 1;
				} else {
					mas[i][j] = 0;
				}
				System.out.print(mas[i][j] + " ");
			}
			System.out.println();
		}
	}
}
