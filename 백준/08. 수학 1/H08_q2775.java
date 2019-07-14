import java.util.Scanner;

public class I08_q2775 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int T = scanner.nextInt();
		int num[] = new int[T];

		int house[][] = new int[15][15];

		for (int i = 1; i < 15; i++)
			house[0][i] = i;

		for (int i = 1; i < 15; i++) {
			for (int j = 1; j < 15; j++) {
				for (int k = 1; k <= j; k++) {
					house[i][j] += house[i - 1][k];
				}
			}
		}

		for (int i = 0; i < T; i++) {
			int floor = scanner.nextInt();
			int number = scanner.nextInt();
			num[i] = house[floor][number];
		}
		for (int i = 0; i < T; i++)
			System.out.println(num[i]);
	}
}
