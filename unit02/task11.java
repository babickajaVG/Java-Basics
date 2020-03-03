package unit02;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class task11 {
	public static void main(String arg[]) {

		System.out.println("enter a");
		Scanner sca = new Scanner(System.in);
		int a = sca.nextInt();

		System.out.println("enter b");
		Scanner scb = new Scanner(System.in);
		int b = scb.nextInt();

		int max = (int) Math.abs(Math.max(a, b));

		HashSet<Integer> common = new HashSet();

		if (max > 10) {
			while (max > 0) {
				int min = (int) Math.abs(Math.min(a, b));
				while (min > 0) {
					if (max % 10 == min % 10) {
						common.add(+max % 10);
					}
					min = min / 10;
				}
				max = max / 10;
			}
		} else {
			int min = (int) Math.abs(Math.min(a, b));
			if (max == min) {
				common.add(+max);
			}
		}
		if (common.isEmpty()) {
			System.out.println("нет одинаковых чисел");
		} else {
			System.out.println("одинаковые цифры:");
			common.forEach(System.out::println);
		}
	}

}