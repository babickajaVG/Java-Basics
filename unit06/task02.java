package unit06;

import java.util.Scanner;

public class task02 {
	  public static void main(String[] arg) {

	    int n = GetArrayLength();
	    int array[][] = new int[n][n];
	    GetArray(array, n);

	  }
	  
	  public static int GetArrayLength() {
			Scanner scn = new Scanner(System.in);
			System.out.println("Enter array length: ");
			while (!scn.hasNextInt()) {
				scn.next();
				System.out.println("Enter array length: ");
			}
			int n = scn.nextInt();
			if (n%2!=0) {
				System.out.println("Enter array length: ");
				 n = scn.nextInt();
			}
			return n;
		}
	
	public static void GetArray(int array[][], int n) {
		 int a = 1;

		    for (int i = 0; i < array.length; i++) {
		      for (int j = array.length - i - 1; j >= 0; j--) {
		        array[i][j] = a;
		        System.out.printf("%3d", array[i][j]);
		      }
		      for (int j = 0; j < array.length; j++) {
		        if (j > n - 1 - i) {

		          array[i][j] = 0;
		          System.out.printf("%3d", array[i][j]);
		        }
		      }
		      a++;
		      System.out.println();
		    }	
	}
	  
	}
