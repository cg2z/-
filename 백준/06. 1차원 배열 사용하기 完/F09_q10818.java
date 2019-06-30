import java.util.Scanner;

public class F09_q10818 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num = scanner.nextInt();
		int arr[] = new int[num];
		for (int i = 0; i < num; i++)
			arr[i] = scanner.nextInt();

		int big = arr[0], small = arr[0];

		for (int i = 0; i < num; i++) {
			if (arr[i] > big)
				big = arr[i];
			if (arr[i] < small)
				small = arr[i];
		}
		System.out.println(small + " " + big);
	}
}
