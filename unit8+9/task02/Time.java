package unit08;

import java.util.Scanner;

public class Time {

	private int h;
	private int m;
	private int s;

	public Time() {
		h = 1;
		m = 1;
		s = 1;
	}

	public Time(int h, int m, int s) {
		this.h = h;
		this.m = m;
		this.s = s;
	}

	public void setH(int h) {
		this.h = h;
	}

	public void setM(int m) {
		this.m = m;
	}

	public void setS(int s) {
		this.s = s;
	}

	public int getH() {
		return h;
	}

	public int getM() {
		return m;
	}

	public int getS() {
		return s;
	}

	public void checkTime() {
		if (h > 24) {
			System.out.println("entered invalid value for hours, set to 0");
			h = 0;
		}
		if (m > 60) {
			System.out.println("entered invalid value for minutes, set to 0");
			m = 0;
		}
		if (s > 60) {
			System.out.println("entered invalid value for seconds, set to 0");
			s = 0;
		}
	}
	
	

	public void printTime() {
		System.out.println(h + "h : " + m + "m : " + s + "s");
	}

	
	public Time changeH() {
		System.out.println("how many hours should be added to the current value?");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		Time tempH = new Time(h, m, s);
		if (x + h > 24) {
			System.out.println("Entered invalid value for hours: the total will be more than 24 hours, set to 0");
			tempH = new Time(0, m, s);
		}
		else {
			h=h+x;
			tempH = new Time(h, m, s);
		}
		return tempH;
	}
	
	public Time changeM() {
		System.out.println("how many minutes should be added to the current value?");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		Time tempH = new Time(h, m, s);
		if (x + m > 60) {
			System.out.println("Entered invalid value for minutes: the total will be more than 60 minutes, set to 0");
			tempH = new Time(h, 0, s);
		}
		else {
			m=m+x;
			tempH = new Time(h, m, s);
		}
		return tempH;
	}
	
	public Time changeS() {
		System.out.println("how many seconds should be added to the current value?");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		Time tempH = new Time(h, m, s);
		if (x + s > 60) {
			System.out.println("Entered invalid value for seconds: the total will be more than 60 seconds, set to 0");
			tempH = new Time(h, m, 0);
		}
		else {
			s=s+x;
			tempH = new Time(h, m, s);
		}
		return tempH;
	}

	
}





























