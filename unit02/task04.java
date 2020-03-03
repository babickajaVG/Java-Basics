package unit02;

import java.util.Scanner;

public class task04 {
	public static void main (String arg []) {
	
		System.out.println("enter a");
		Scanner sca = new Scanner (System.in);
		int a = sca.nextInt();
		
		System.out.println("enter b");
		Scanner scb = new Scanner (System.in);
		int b = scb.nextInt();
		
		System.out.println("enter c");
		Scanner scc = new Scanner (System.in);
		int c = scc.nextInt();
		
		System.out.println("enter x");
		Scanner scx = new Scanner (System.in);
		int x = scx.nextInt();
		
		int s;
		
		s=Math.abs((a*x*x)+(b*x)+c);
		
		System.out.println("module = " + s);
		}
}
