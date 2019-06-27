import java.util.Scanner;

public class F01_q2562 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num[] = new int[9];
		int big = 0, index = 0;
		for (int i = 0; i < 9; i++) {
			num[i] = scanner.nextInt();
			if (num[i] > big) {
				big = num[i];
				index = i+1;
			}
		}
		System.out.print(big+"\n"+index);
	}
}
