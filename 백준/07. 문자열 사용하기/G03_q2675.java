import java.util.Scanner;

public class G03_q2675 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int number[] = new int[num];
		String string[] = new String[num];
		for (int i = 0; i < num; i++) {
			number[i] = scanner.nextInt();
			string[i] = scanner.next();
		}

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < string[i].length(); j++) {
				for (int k = 0; k < number[i]; k++) {
					System.out.print(string[i].charAt(j));
				}
			}
			System.out.println();
		}
	}
}
