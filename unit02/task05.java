package unit02;

import java.util.Scanner;

public class task05 {
	public static void main (String arg []) {
		
		System.out.println("enter A:");
		Scanner sca = new Scanner(System.in);
		int a=sca.nextInt();
		
		System.out.println("enter B:");
		Scanner scb = new Scanner(System.in);
		int b=scb.nextInt();
		
		
		if (Math.abs(a)==Math.abs(b)) {
			System.out.println("squared are equal");
		} 
		else {
			if (Math.sqrt(a)<Math.sqrt(b)) {
			System.out.println("squared number A less");
			}
			else {
			System.out.println("squared number B less");
			}
		}
	}

}
