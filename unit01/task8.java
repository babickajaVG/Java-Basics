package by.ld.unit01;

public class task8 {
	public static void main (String[] args) {
		double a, b, c;
		double res;
		
		a=4;
		b=4;		
		c=3;	
		
		res= (b + Math.sqrt(Math.pow(b, 2) + 4*a*c))/(2*a) - Math.pow(a, 3)*c + Math.pow(b, -2);
		
		
		System.out.println("res = " + res);
		
		
	}

}
