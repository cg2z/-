import java.util.Scanner;

public class J03_q1929 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int M = scanner.nextInt();
		int N = scanner.nextInt();

		int num[] = new int[N + 1];

		for (int i = 0; 2 * i <= N; i++)
			num[2 * i] = 1;
		num[2] = 0;

		for (int i = 2; i <= N; i++) {
			if (num[i] == 0) {
				for (int j = 2; i * j <= N; j++)
					num[i * j] = 1;
				if (i >= M)
					System.out.println(i);
			}
		}
	}
}
