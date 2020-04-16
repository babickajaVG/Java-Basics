package unit05;

import java.util.Scanner;

public class task02 {
	public static void main(String[] arg) {

		int size1 = GetSize1(); // получаем размер первого массива
		int[] array1 = new int[size1]; // объявляем первый массив
		GetArray1(array1); // задаем значения для первого массива
		int size2 = GetSize2(array1); // получаем размер второго массива
		PrintSizeArray2(size2); // отображаем есть ли вообще второй массив
		int[] array2 = new int[size2]; // объявляем второй массив
		GetArray2(array1, array2);

	}

	public static int GetSize1() {
		System.out.println("Enter lenth of first Array:");
		Scanner scsize1 = new Scanner(System.in);
		int size1 = scsize1.nextInt();
		return size1;
	}

	public static void GetArray1(int array1[]) {
		for (int i = 0; i < array1.length; i++) {
			array1[i] = (int) (Math.random() * 5);// не надо делать большой диапозон - если маленький массив - нулей не будет
			
			if (array1[i] == 0) {
				System.out.println("array1[" + i + "]=" + array1[i] + " - will be an element of second Array");
			} else {
				System.out.println("array1[" + i + "]=" + array1[i] + "; ");
			}
		}
	}

	public static int GetSize2(int array1[]) {
		int size2 = 0;
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] == 0) {
				size2 = size2 + 1;
			}
		}
		return size2;
	}

	public static void PrintSizeArray2(int size2) {
		if (size2 == 0) {
			System.out.println("\nThere are no zero elements in the first Array\n");
		} else {
			System.out.println("\nLenth of the second Array = " + size2 + "\n");
		}
	}

	public static void GetArray2(int array1[], int array2[]) {
		int j = 0;
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] == 0) {
				array2[j] = i;
				System.out.println("array2[" + j + "]=" + array2[j] + "; ");
				j++;
			}
		}
	}
}
