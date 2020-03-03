package unit02;

import java.util.Scanner;

public class task09 {
	public static void main (String arg []) {
		
		System.out.println("enter a");
		Scanner sca = new Scanner(System.in);
		double a = sca.nextDouble();
		
		System.out.println("enter b");
		Scanner scb = new Scanner(System.in);
		double b = scb.nextDouble();
		
		System.out.println("enter c");
		Scanner scc = new Scanner(System.in);
		double c = scc.nextDouble();
		
		if (a>=0) {
			a=Math.pow(a, 2);
			System.out.println("a больше/равно 0 и его квадрат = " + a);
		} 
		else {
			a=Math.pow(a, 4);
			System.out.println("a меньше 0 и его 4я степень = " + a);
		}
		
		if (b>=0) {
			b=Math.pow(b, 2);
			System.out.println("b больше/равно 0 и его квадрат = " + b);
		} 
		else {
			b=Math.pow(b, 4);
			System.out.println("b меньше 0 и его 4я степень = " + b);
		}
		if (c>=0) {
			c=Math.pow(c, 2);
			System.out.println("c больше/равно 0 и его квадрат = " + c);
		} 
		else {
			c=Math.pow(c, 4);
			System.out.println("c меньше 0 и его 4я степень = " + c);
		}
		
	}

}
