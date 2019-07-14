import java.util.Scanner;

public class I03_q2292 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num = scanner.nextInt();
		int count = 1;
		while (num > 1) {
			num -= 6*count;
			count++;
		}
		System.out.println(count);
	}
}
