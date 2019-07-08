import java.util.Scanner;

public class J06_q1085 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int x = scanner.nextInt();
		double y = scanner.nextInt();
		int w = scanner.nextInt();
		double h = scanner.nextInt();

		double xRange = 0, yRange = 0, result = 0;

		xRange = ((w / 2 < x) ? w - x : x);
		yRange = ((h / 2 < y) ? h - y : y);
		result = xRange <= yRange ? xRange : yRange;
		System.out.println((int) result);
	}
}
