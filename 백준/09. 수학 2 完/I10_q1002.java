import java.util.Scanner;

public class J10_q1002 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num = scanner.nextInt();

		int circle[] = new int[num];

		for (int i = 0; i < num; i++) {
			double x1 = scanner.nextInt();
			double y1 = scanner.nextInt();
			double r1 = scanner.nextInt();
			double x2 = scanner.nextInt();
			double y2 = scanner.nextInt();
			double r2 = scanner.nextInt();

			double length = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

			if (length == Math.abs(r1 - r2) || length == r1 + r2)
				circle[i] = 1;
			else if (length < r1 + r2)
				circle[i] = 2;
			if (length > r1 + r2 || length < Math.abs(r1 - r2))
				circle[i] = 0;
			if (x1 == x2 && y1 == y2 && r1 == r2)
				circle[i] = -1;
		}

		for (int i = 0; i < num; i++)
			System.out.println(circle[i]);
	}
}
