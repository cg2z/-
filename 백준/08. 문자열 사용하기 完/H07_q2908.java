import java.util.Scanner;

public class H07_q2908 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num = scanner.nextInt();
		int num2 = scanner.nextInt();

		num += (-(num % 10) + num % 10 * 100) + ((num / 100) - num / 100 * 100);
		num2 += (-(num2 % 10) + num2 % 10 * 100) + ((num2 / 100) - num2 / 100 * 100);

		if(num>num2)
			System.out.print(num);
		else
			System.out.print(num2);
	}
}
