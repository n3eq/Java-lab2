package zad1;

import java.util.Scanner;

public class MyApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int a;
		int b;
		int c;

		System.out.println("Podaj wspolczynniki a,b,c rownania(pojedynczo):");
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();

		QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);

		quadraticEquation.calculate();

		input.close();
	}

}
