import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int contIn = 0;
		int contOut = 0;

		for (int i = 0; i < n; i++) {

			int x = sc.nextInt();

			if (x >= 10 && x <= 20) {
				contIn++;
			} else {
				contOut++;
			}
		}

		System.out.println(contIn + " in");
		System.out.println(contOut + " out");

	}

}
