import java.util.Scanner;

public class C13_q11021 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num = scanner.nextInt();
		int arr[] = new int[num];

		for (int i = 0; i < num; i++) {
			int first = scanner.nextInt();
			int second = scanner.nextInt();
			arr[i] = first + second;
		}
		for (int i = 0; i < num; i++)
			System.out.println("Case #"+(i+1)+": "+arr[i]);
	}
}
