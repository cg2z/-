import java.util.Scanner;

public class C07_q2441 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		for (int i = 1; i <= num; i++) {
			for (int j = 2; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = num - i; k >= 0; k--)
				System.out.print("*");

			System.out.println();
		}
	}
}