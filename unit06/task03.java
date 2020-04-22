package unit06;

import java.util.Scanner;

public class task03 {
	public static void main(String[] arg) {

		int n = GetArrayLength();
		int array[][] = new int[n][n];

		for (int i = 0; i < array.length / 2; i++) {
			for (int j = 0; j < array.length / 2; j++) {// upper left quarter of the array

				if (j >= i) {
					array[i][j] = 1;
				} else {
					array[i][j] = 0;
				}
				System.out.printf("%3d", array[i][j]);
			}
			for (int j = array.length / 2; j < n; j++) {// upper right quarter of the array
				if (j < n - i) {
					array[i][j] = 1;
				} else {
					array[i][j] = 0;
				}
				System.out.printf("%3d", array[i][j]);
			}
			System.out.println();
		}

		for (int i = array.length / 2; i < n; i++) {
			for (int j = 0; j < array.length / 2; j++) {// lower left quarter of the array
				if (j < n - i - 1) {
					array[i][j] = 0;
				} else {
					array[i][j] = 1;
				}
				System.out.printf("%3d", array[i][j]);
			}
			for (int j = array.length / 2; j < n; j++) {// lower right quarter of the array
				if (j > i) {
					array[i][j] = 0;
				} else {
					array[i][j] = 1;
				}
				System.out.printf("%3d", array[i][j]);
			}

			System.out.println();
		}

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

}

