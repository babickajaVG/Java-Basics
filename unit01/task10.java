package by.ld.unit01;

public class task10 {
public static void main (String arg []) {

	double x, y, z, temp, Q;
	
	x=10.2;
	y=13.6;
	z=x*y;
	
	temp = Math.cos(x) - Math.sin(y);
	if (temp !=0) {
		Q = ((Math.sin(x) + Math.cos(y))/temp) * (Math.sin(z)/Math.cos(z));
	}
	else {
		System.out.println("Знаменатель равен нулю");
		Q = Double.NaN;
	}
	System.out.println("Q = " + Q);
	
}
}
