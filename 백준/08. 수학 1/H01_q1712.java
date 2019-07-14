import java.util.Scanner;

public class I01_q1712 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();

		if (C <= B)
			System.out.println(-1);

		else
			System.out.println(A / (C - B) + 1);

		/*
		 * 손익분기점 (C * count > A + (B * count)) -> count > A/(C-B) 일 때 손익분기점 만들어짐
		 */
	}
}
