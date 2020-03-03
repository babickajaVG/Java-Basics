package unit02;

import java.util.Scanner;

public class task18 {
	public static void main(String arg[]) {

		System.out.println("enter a:");
		Scanner sca = new Scanner(System.in);
		double a = sca.nextDouble();

		System.out.println("enter b:");
		Scanner scb = new Scanner(System.in);
		double b = scb.nextDouble();

		System.out.println("enter h:");
		Scanner sch = new Scanner(System.in);
		double h = sch.nextDouble();

		double c = b - a;

		if (c < h) {
			System.out.println("шаг больше отрезка :), может в следующий раз");
		}
		while (c >= h) {
			double x = a + h;
			double alpha = (x * 180) / Math.PI;
			double F = (1 - Math.cos(2 * alpha)) / 2;
			System.out.println("|значение аргумента x= " + x + "| |значение функции в точке x= " + F + "|");
			c = c - h;
			a=a+h;
		}

	}

}
