package unit02;

import java.util.Scanner;

public class task02 {
	public static void main (String arg []) {
		System.out.println("enter a:");
		Scanner sca = new Scanner(System.in);
		int a = sca.nextInt();
		
		System.out.println("enter b:");
		Scanner scb = new Scanner (System.in);
		int b=scb.nextInt();
		int c;
		
		c = Math.min(a, b);
		
		
		if (a==b) {
			System.out.println("numbers are equal");
			}
		else {
		if (a==c) {
			System.out.println("a less");
		}
		else {
		if (b==c) {System.out.println("b less");
		}
	}}}

}
