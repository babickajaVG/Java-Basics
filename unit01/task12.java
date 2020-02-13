package by.ld.unit01;

public class task12 {
	public static void main (String arg []) {
		double x1, x2, y1, y2, xd, yd, td,z;
		// xd, yd - расстояние между 1и2, td - расстояние между 1 и 2 точкой
		
		x1=1; 
		y1=1;
		x2=4;
		y2=5;
		xd=x2-x1;
		yd=y2-y1;
		z=Math.pow(xd, 2) + Math.pow(yd,2);
		td=Math.sqrt(z);
		
		System.out.println("Расстояние между (:) 1 и 2 = " + td);
	}

}
