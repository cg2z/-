import java.util.Scanner;

public class K01_q2750 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num = scanner.nextInt();
		int arr[] = new int[num];

		for (int i = 0; i < num; i++)
			arr[i] = scanner.nextInt();

		int save = 0;
		for (int i = 0; i < num; i++) {
			for (int j = 1; j < num - i; j++) {
				if (arr[j] < arr[j - 1]) {
					save = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = save;
				}
			}
		}

		for (int i = 0; i < num; i++)
			System.out.println(arr[i]);
	}
}
