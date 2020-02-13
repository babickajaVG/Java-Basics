package by.ld.unit01;

public class task13 {
	public static void main (String arg []) {
		double x1, x2, x3, y1, y2, y3, x1d, x2d, x3d, y1d, y2d, y3d, P, S, z1, z2, z3, p;
		
		x1=1;
		x2=6;
		x3=4;
		y1=1;
		y2=1;
		y3=5;
		
		x1d=x2-x1;
		y1d=y2-y1;
		z1=Math.sqrt(Math.pow(x1d, 2)+Math.pow(y1d, 2));
		
		x2d=x3-x2;
		y2d=y3-y2;
		z2=Math.sqrt(Math.pow(x2d, 2)+Math.pow(y2d, 2));
		
		x3d=x1-x2;
		y3d=y1-y3;
		z3=Math.sqrt(Math.pow(x3d, 2)+Math.pow(y3d, 2));
		
		P=z1+z2+z3;
		
		p=P/2;
		
		S=Math.sqrt(p*(p-z1)*(p-z2)*(p-z3));
		
		
		System.out.println("Площадь равна = " + S + ", периметр - " + P);
	}

}
