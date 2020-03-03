package unit02;

import java.util.Scanner;

public class task01 {
	public static void main (String arg []) {
		
	       System.out.println("enter a:");
	       Scanner sca = new Scanner(System.in);
	       
	       int a = sca.nextInt();
	       
	       System.out.println("enter b:");
	       Scanner scb = new Scanner(System.in);
	       
	       int b = scb.nextInt();
	   
		
	 if (a==b) {
		 System.out.println("numbers are equal");
	 }
	 else System.out.println("numbers are not equal");
		
	} 

}
