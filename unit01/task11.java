package by.ld.unit01;

public class task11 {
	public static void main (String arg []) {
		double a, b, c, z, S, P;
		a=3;
		b=4;
		
		z=Math.pow(a,2) + Math.pow(b,2);
		c=Math.sqrt(z);
		
		S = (a*b)/2;
		P = a+b+c;
		System.out.println("Площадь равна = " + S + ", периметр - " + P);
	}

}
