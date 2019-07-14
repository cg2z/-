import java.util.Scanner;

public class J01_q1978 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num = scanner.nextInt();
		int arr[] = new int[num];
		int save = 0;

		for (int i = 0; i < num; i++) {
			arr[i] = scanner.nextInt();
			int count = 0;
			for (int j = 1; j <= arr[i]; j++) {
				if (arr[i] % j == 0)
					count++;
			}

			if (count == 2)
				save++;
		}
		System.out.print(save);
	}
}
