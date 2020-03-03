package unit02;

import java.util.Scanner;

public class task08 {
	public static void main (String arg []) {
		
		System.out.println("Set the sides of the first triangle \n"
			+ "enter the length of the edge a1:");
		Scanner sca1 = new Scanner(System.in);
		double a1=sca1.nextDouble();
		
		System.out.println("enter the length of the edge b1:");
		Scanner scb1 = new Scanner(System.in);
		double b1=scb1.nextDouble();
		
		System.out.println("enter the length of the edge c1:");
		Scanner scc1 = new Scanner(System.in);
		double c1=scc1.nextDouble();
		
		System.out.println("Set the sides of the second triangle \n"
				+"enter the length of the edge a2:");
		Scanner sca2 = new Scanner(System.in);
		double a2=sca2.nextDouble();
		
		System.out.println("enter the length of the edge b2:");
		Scanner scb2 = new Scanner(System.in);
		double b2=scb2.nextDouble();
		
		System.out.println("enter the length of the edge c2:");
		Scanner scc2 = new Scanner(System.in);
		double c2=scc2.nextDouble();
		
		double S1, P1, S2, P2; //S-square, P - half perimeter//
		
		P1=(a1+b1+c1)/2;
		P2=(a2+b2+c2)/2;
		S1=Math.sqrt(P1*(P1-a1)*(P1-b1)*(P1-c1));
		S2=Math.sqrt(P2*(P2-a2)*(P2-b2)*(P2-c2));
		
		if (S1==S2) {
			System.out.println("the area of the first triangle is equal to the area of the second");
		} else {
		if (S1>S2) {
			System.out.println("the area of the first triangle (S1) is larger");
		}
		else {
			System.out.println("the area of the second triangle (S2) is larger");
		}
		}
		
	}

}
