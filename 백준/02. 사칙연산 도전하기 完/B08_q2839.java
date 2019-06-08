import java.util.Scanner;

public class B08_q2839 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int count = 0;
		int num = scanner.nextInt();
		while (num > 0) {
			if (num % 5 == 0) {
				num -= 5;
				count++;
			} else if (num % 3 == 0) {
				num -= 3;
				count++;
			} else if (num > 5) {
				num -= 5;
				count++;
			} else {
				count = -1;
				break;
			}
		}
		System.out.print(count);
	}
}