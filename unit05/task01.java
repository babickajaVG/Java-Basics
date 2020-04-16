package unit05;

import java.util.Scanner;

public class task01 {

	public static void main(String[] args) {

		int size = GetArrayLenth();
		int[] mas = new int[size];
		int k = GetK();
		GetMass(mas);
		int x = GetSum(mas, k);
	}

	public static int GetArrayLenth() {
		System.out.println("Enter mass lenth");
		Scanner scsize = new Scanner(System.in);
		int size = scsize.nextInt();
		return size;
	}

	public static int GetK() {
		System.out.println("Enter divisor");
		Scanner sck = new Scanner(System.in);
		int k = sck.nextInt();
		return k;
	}

	public static int GetSum(int mas[], int k) {
		int x = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] % k == 0) {
				x = x + mas[i];
				System.out.println(mas[i] + " - this number is divisible by k = " + k);
			}
		}
		System.out.println("\nSum of all elements of array which divided by k (k = " + k + ") is equal to " + x);
		return x;
	}

	public static void GetMass(int mas[]) {
		System.out.println("\nDisplay the array with random integers in the range [1,100]");
		for (int i = 0; i < mas.length; i++) {
			mas[i] = (int) (1 + Math.random() * 100);
			System.out.println(mas[i]);
		}
		System.out.println();

	}

}
