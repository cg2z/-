import java.util.Scanner;

public class C10_q11720 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num = scanner.nextInt();
		String num2 = scanner.next();

		int sum = 0;
		for (int i = 0; i < num; i++)
			sum += num2.charAt(i)-48;
		System.out.println(sum);
	}
}