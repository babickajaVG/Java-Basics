package unit02;

import java.util.Scanner;

public class task14 {
	public static void main(String arg[]) {
		int n = 10000;
		for (int i = 1000; i < n; i++) {
			int a = i % 10;
			int b = (i / 10) % 10;
			int c = (i / 100) % 10;
			int d = (i / 1000) % 10;
			int t = a + b + c + d;
			if (t == 15) {
				System.out.println(+i);
			}
		}
	}
}
