import java.util.Scanner;

public class D03_q10871 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int len = scanner.nextInt();
		int num = scanner.nextInt();
		int arr[] = new int[len];

		for (int j = 0; j < len; j++)
			arr[j] = scanner.nextInt();
		for (int i = 0; i < len; i++) {
			if (arr[i] < num)
				System.out.print(arr[i] + " ");
		}
	}
}
