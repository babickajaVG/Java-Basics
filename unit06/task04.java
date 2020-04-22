package unit06;

import java.util.Scanner;

public class task04 {

	public static void main(String[] arg) {

		int n = getSize();
		int m = getSize();
		int array[][] = new int[n][m];
		GetArrayElems(array);
		GetSumOfNegativeElems(array); //calculate the sum of negative elements in each row
		GetMaxElemInRow(array); //determine the maximum element in each row
		int[] min = GetMinElemInArray(array);
		int[] max = GetMaxElemInArray(array);
		SwapMaxAndMinElems(array, max, min); // swap the maximum and minimum elements of the matrix

	}

	public static int getSize() {
		System.out.println("Enter the length of one and the sides of the array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		return size;

	}

	public static void GetArrayElems(int array[][]) {
		System.out.println("\nDisplay the resulting array\n");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = (int) (Math.random() * 100) - 50;
				System.out.printf("%4d", array[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void GetSumOfNegativeElems(int array[][]) {
		for (int i = 0; i < array.length; i++) {
			int neg = 0;
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] < 0) {
					neg = neg + array[i][j];
				}
			}
			if (neg == 0) {
				System.out.println("There are no negative numbers in the " + (i + 1) + " row");
			} else {
				System.out.println("Sum of negative numbers in the " + (i + 1) + " row is equal to " + neg);
			}
		}
		System.out.println();
	}

	public static void GetMaxElemInRow(int array[][]) {

		for (int i = 0; i < array.length; i++) {
			int max = array[i][0];
			for (int j = 0; j < array[i].length; j++) {
				if (max < array[i][j]) {
					max = array[i][j];

				}
			}
			System.out.println("Maximum element in the " + (i + 1) + " row is equal to " + max);

		}
		System.out.println();
	}

	public static int[] GetMaxElemInArray(int array[][]) {
		int point[] = new int[2];

		int max = array[0][0];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (max < array[i][j]) {
					max = array[i][j];
					point[0] = i;
					point[1] = j;
				}
			}
		}
		/*
		 * System.out.println("Maximum array element = " + max);
		 * System.out.println("The location of the maximum element of the array = [" +
		 * point[0] + "][" + point[1] + "]"); System.out.println();
		 */
		return point;
	}

	public static int[] GetMinElemInArray(int array[][]) {

		int min = array[0][0];
		int point[] = new int[2];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (min > array[i][j]) {
					min = array[i][j];
					point[0] = i;
					point[1] = j;
				}
			}
		}
		/*
		 * System.out.println("Minimum array element = " + min);
		 * System.out.println("The location of the minimum element of the array = [" +
		 * point[0] + "][" + point[1] + "]"); System.out.println();
		 */
		return point;
	}

	public static void SwapMaxAndMinElems(int array[][], int max[], int min[]) {

		System.out.println("\nDisplay array before swich:");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.printf("%4d", array[i][j]);
			}
			System.out.println();
		}

		int imin = min[0];
		int jmin = min[1];
		int imax = max[0];
		int jmax = max[1];

		int temp = array[imin][jmin];
		array[imin][jmin] = array[imax][jmax];
		array[imax][jmax] = temp;

		System.out.println("\nDisplay array after swich:");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.printf("%4d", array[i][j]);
			}
			System.out.println();
		}
	}

}