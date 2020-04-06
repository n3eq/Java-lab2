package zad1;

public class QuadraticEquation {

	private int a;
	private int b;
	private int c;

	public QuadraticEquation(int a, int b, int c) {

		try {

			validateData(a, b, c);
		} catch (Exception e) {

			System.out.println(e.getMessage());
			System.exit(0);
		}

	}

	public void calculate() {

		int delta = calculateDelta();

		if (delta < 0) {
			System.out.println("Rownanie nie ma rozwiazania.");
		} else if (delta == 0) {

			System.out.println("Rozwiazanie: x = " + calculateDeltaZero());
		} else if (delta > 0) {

			double x[] = new double[2];
			x = calculateDeltaGreater(delta);
			System.out.println("Rozwiazanie: x1 = " + x[0] + "\n" + "Rozwiazanie: x2 = " + x[1]);
		}
	}

	private int calculateDelta() {

		int delta = (b * b) - 4 * a * c;
		return delta;
	}

	private int calculateDeltaZero() {

		int x = -b / 2 * a;
		return x;
	}

	private double[] calculateDeltaGreater(int delta) {

		double[] x = new double[2];

		x[0] = (-b - Math.sqrt(delta)) / 2 * a;
		x[1] = (-b + Math.sqrt(delta)) / 2 * a;

		return x;
	}

	private void validateData(int a, int b, int c) throws Exception {

		if (a == 0)
			throw new Exception("wspolczynnik 'a' nie moze byc rowny 0");
		else {
			this.a = a;
			this.b = b;
			this.c = c;
		}
	}
}
