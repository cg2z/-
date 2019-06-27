import java.util.Scanner;

public class E01_q15596 {
	static long sum(int[] a) {
		long ans = 0;
		for (int i = 0; i < a.length; i++)
			ans += a[i];
		return ans;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int[] arr = new int[num];

		for (int i = 0; i < num; i++)
			arr[i] = scanner.nextInt();

		System.out.print(sum(arr));
	}
}
