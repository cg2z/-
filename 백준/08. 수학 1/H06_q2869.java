import java.util.Scanner;

public class I06_q2869 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int V = scanner.nextInt();

		int save = (V - A) / (A - B) + 1;

		System.out.println(((V - A) % (A - B) == 0) ? save : save + 1);
	}
}
