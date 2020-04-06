package zad2;

import java.util.Scanner;

public class MyApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int a1, a2, b1, b2, c1, c2;

		System.out.println("Podaj wspolczynniki a,b,c pierwszego rownania(pojedynczo):");
		a1 = input.nextInt();
		b1 = input.nextInt();
		c1 = input.nextInt();

		System.out.println("Podaj wspolczynniki a,b,c drugiego rownania(pojedynczo):");
		a2 = input.nextInt();
		b2 = input.nextInt();
		c2 = input.nextInt();

		SystemOfEquations systemOfEquations = new SystemOfEquations(a1, b1, c1, a2, b2, c2);

		systemOfEquations.calculate();

		input.close();
	}

}
