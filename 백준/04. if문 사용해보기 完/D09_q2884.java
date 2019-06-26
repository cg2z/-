import java.util.Scanner;

public class D09_q2884 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int hour = scanner.nextInt();
		int min = scanner.nextInt();

		if (min - 45 < 0) {
			hour--;
			min = min + 15;
			if (hour < 0)
				hour += 24;
		} else
			min -= 45;
		System.out.print(hour + " " + min);
	}
}
