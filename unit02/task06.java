package unit02;

import java.util.Scanner;

public class task06 {
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
		
		if (a==b) {			
			if (a==c) {
				System.out.println("равнобедренный");
			} 
			else {
				System.out.println("равносторонний");
			}
		} 
		else {
				if (a==c) {
					System.out.println("равносторонний");
				}
				else {
					if (b==c) {
						System.out.println("равносторонний");
					} else {
					System.out.println("разносторонний");
				}}
			}
		}

}
