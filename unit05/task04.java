package unit05;

import java.util.Scanner;

public class task04 {
	public static void main(String[] arg) {

		int ar1 = GetArray1Length();
		int array1[] = new int[ar1];
		SetArray1(array1);
		int ar2 = GetArray2Length(array1);
		int array2[] = new int[ar2];
		SetArray2(array1, array2);

	}

	public static int GetArray1Length() {
		System.out.println("ввести размер массива всех чисел");
		Scanner scar1 = new Scanner(System.in);
		int ar1 = scar1.nextInt();
		return ar1;

	}

	public static void SetArray1(int array1[]) {
		for (int i = 0; i < array1.length; i++) {
			array1[i] = (int) (Math.random() * 10);
			System.out.println("array1 [" + i + "] = " + array1[i]);
		}
	}

	public static int GetArray2Length(int array1[]) {
		int ar2 = 0;
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] % 2 == 0) {
				ar2 = ar2 + 1;
			}
		}
		System.out.println("\nвторой массив\n");
		return ar2;
	}

	public static void SetArray2(int array1[], int array2[]) {
		int j = 0;
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] % 2 == 0) {
				array2[j] = array1[i];
				System.out.println("array2 [" + j + "] = " + array2[j]);
				j++;
			}
		}
	}
}
