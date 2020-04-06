package zad_kalkulator;

import java.util.Scanner;

public class MyApp {

	private enum Operation {
		Add, Substract, Divide, Multiply
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Kalkulator, wybierz jedno z ponizszych dzialan: ");
		System.out.println("Dodawanie ");
		System.out.println("Odejmowanie ");
		System.out.println("Dzielenie ");
		System.out.println("Mnozenie ");

		System.out.println("Podaj operacje do wykonania(slownie)('Add','Substract','Divide' or 'Multiply')");
		String strOperationType = input.next();

		Operation operation = Operation.valueOf(strOperationType);

		System.out.println("Podaj argumenty dzialania: ");
		System.out.println("Podaj 1: ");
		int a = input.nextInt();
		System.out.println("Podaj 2: ");
		int b = input.nextInt();

		switch (operation) {

		case Add:
			System.out.println("Wynik: " + (a + b));
			break;
		case Substract:
			System.out.println("Wynik: " + (a - b));
			break;
		case Divide:
			if (b == 0) {
				System.out.println("nie dzielimy przez 0");
				break;
			} else {
				System.out.println("Wynik: " + (a / b));
			}
			break;
		case Multiply:
			System.out.println("Wynik: " + (a * b));
			break;

		default:
			System.out.println("Blad!!!");
			System.exit(0);
		}

	}

}
