package unit02;

import java.util.Scanner;

public class task07 {
	public static void main (String arg []) {
		
		System.out.println("enter the radius of the first circle (R1)");
		Scanner sc1=new Scanner(System.in);
		int r1=sc1.nextInt();
		
		System.out.println("enter the radius of the second circle (R2)");
		Scanner sc2=new Scanner(System.in);
		int r2=sc2.nextInt();
		
		if (r1>r2) {
			System.out.println("the area of the first circle is larger");
		}
		else {
			System.out.println("the area of the second circle is larger");
		}
	}
}
