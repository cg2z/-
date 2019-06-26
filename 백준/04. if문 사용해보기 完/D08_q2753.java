import java.util.Scanner;

public class D08_q2753 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num = scanner.nextInt();

		if (num % 4 == 0 && num % 100 != 0)
			System.out.println("1");
		else if (num % 4 == 0 && num % 400 == 0)
			System.out.print("1");
		else if (num % 4 == 0 && num % 100 == 0)
			System.out.println("0");
		else
			System.out.println("0");
	}
}