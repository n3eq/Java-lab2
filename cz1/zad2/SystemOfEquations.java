package zad2;

public class SystemOfEquations {

	private int a1, a2, b1, b2, c1, c2;

	private int w, wx, wy;

	public SystemOfEquations(int a1, int b1, int c1, int a2, int b2, int c2) {

		this.a1 = a1;
		this.a2 = a2;
		this.b1 = b1;
		this.b2 = b2;
		this.c1 = c1;
		this.c2 = c2;

		System.out.println("Twoj uklad rownan: ");
		System.out.println("{ " + a1 + "x" + " + " + b1 + "y" + " = " + c1);
		System.out.println("{ " + a2 + "x" + " + " + b2 + "y" + " = " + c2);
	}

	public void calculate() {

		w = a1 * b2 - a2 * b1;
		wx = c1 * b2 - c2 * b1;
		wy = a1 * c2 - a2 * c1;

		if (w != 0) {

			double x = wx / w;
			double y = wy / w;

			System.out.println("x = " + x);
			System.out.println("y = " + y);
		} else if (w == 0 && wx != 0 || wy != 0) {

			System.out.println("Brak rozwiazan.");
			System.exit(0);
		} else if (w == 0 && wx == 0 && wy == 0) {

			System.out.println("Nieskonczenie wiele rozwiazan.");
			System.exit(0);
		}
	}
}
