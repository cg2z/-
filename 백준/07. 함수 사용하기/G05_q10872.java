import java.util.Scanner;

public class G05_q10872 {
	static int factorial(int num) {
		if (num == 1 || num == 0)
			return 1;

		else
			return num * factorial(num - 1);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num = scanner.nextInt();

		System.out.println(factorial(num));
	}
}
