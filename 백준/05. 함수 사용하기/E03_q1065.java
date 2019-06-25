import java.util.Scanner;

public class E02_q1065 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();

		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (i < 100)
				count++;
			else if (i >= 100 && i < 1000) {

				if((i / 10 - (i/100*10)-i/100)==(i%10-(i / 10 - (i/100*10))))
					count++;
			}
		}
		System.out.print(count);
	}
}
