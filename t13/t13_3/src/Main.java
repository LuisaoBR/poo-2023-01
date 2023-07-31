import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		double x = sc.nextDouble();
		double y = sc.nextDouble();

		while ((x != 0) && (y != 0)) {
			if (x > 0.0 && y > 0.0) {
				System.out.println("primeiro");
				x = sc.nextDouble();
				y = sc.nextDouble();
			} else if (x > 0.0 && y < 0.0) {
				System.out.println("quarto");
				x = sc.nextDouble();
				y = sc.nextDouble();
			} else if (x < 0.0 && y > 0.0) {
				System.out.println("segundo");
				x = sc.nextDouble();
				y = sc.nextDouble();
			} else {
				System.out.println("terceiro");
				x = sc.nextDouble();
				y = sc.nextDouble();
			}
		}

	}

}
