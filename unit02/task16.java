package unit02;

public class task16 {

	public static void main(String arg[]) {

		long n, sum, i, j, finalmult = 1;
		n = 10;
		for (i = 1; i <= n; i++) {
			sum = 0;
			for (j = 1; j <= i; j++) {
				sum += j;
			}
			finalmult = finalmult * sum;
		}
		System.out.println("TOTAL: " + finalmult);
	}
}
