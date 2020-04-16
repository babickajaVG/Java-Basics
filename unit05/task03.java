package unit05;

import java.util.Scanner;

public class task03 {
	public static void main(String[] arg) {

		int n = GetArrayLength();
		int array[] = new int[n];
		SetArrayElements(array);
		Resolve(array);
	}

	public static int GetArrayLength() {
		System.out.println("Enter sequence lenght: n=");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		return n;
	}

	public static void SetArrayElements(int array[]) {
		Scanner scelem = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter value of the element n= " + i);
			array[i] = scelem.nextInt();
		}
	}

	public static void Resolve(int array[]) {
		for (int i = 0; (i + 1) < array.length; i++) {
			if (array[i] <= array[i + 1]) { // возрастающая, а не строго возрастающая(т.е. а1=а2 - возрастает)
				continue;
			} else {
				System.out.println("the sequence decreases");
				return;
			}
		}
		System.out.println("the sequence increases");
	}
}
