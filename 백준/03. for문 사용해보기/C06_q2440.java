import java.util.Scanner;

public class C06_q2440 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		for (int i = 1; i <= num; i++) {
			for (int k = num - i; k >= 0; k--)
				System.out.print("*");
			System.out.println();
		}
	}
}