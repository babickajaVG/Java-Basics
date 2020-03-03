package unit02;

import java.util.Scanner;

public class task10 {
	public static void main (String arg []) {
		System.out.println("enter a");
		Scanner sca=new Scanner (System.in);
		int a=sca.nextInt();
		
		System.out.println("enter b");
		Scanner scb=new Scanner (System.in);
		int b=scb.nextInt();
		
		System.out.println("enter c");
		Scanner scc=new Scanner (System.in);
		int c=scc.nextInt();
		
		System.out.println("enter d");
		Scanner scd=new Scanner (System.in);
		int d=scd.nextInt();
		
		int r;
		
		r=Math.max(Math.min(a, b), Math.min(c, d));
		
		if (a==r) {
			System.out.println(r + " = a - result");
		}
		else {
			if (b==r) {
				System.out.println(r + " = b - result");
			}
			else {
				if (c==r) {
					System.out.println(r + " = c - result");
				}
				else {
					System.out.println(r + " = d - result");
				}
			}
		}
	}

}
