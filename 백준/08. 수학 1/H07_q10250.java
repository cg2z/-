import java.util.Scanner;

public class I07_q10250 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int T = scanner.nextInt();
		int roomNum[] = new int[T];

		for (int i = 0; i < T; i++) {
			int height = scanner.nextInt();
			int width = scanner.nextInt();
			int num = scanner.nextInt();

			if (num % height == 0)
				roomNum[i] = (height * 100 + (num - 1) / height + 1);
			else
				roomNum[i] = (num % height * 100 + (num - 1) / height + 1);
		}
		for (int i = 0; i < T; i++)
			System.out.println(roomNum[i]);
	}
}
