import java.util.Scanner;

public class J08_q4153 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			int w = scanner.nextInt();
			int h = scanner.nextInt();
			int r = scanner.nextInt();
			if (w == 0 && h == 0 && r == 0)
				break;
			System.out.println((w * w + h * h == r * r)||(w * w + r * r == h * h)||(r * r + h * h == w * w) ? "right" : "wrong");
		}
	}
}
