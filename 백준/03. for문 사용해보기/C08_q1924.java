import java.util.Scanner;

public class C08_q1924 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		int date = scanner.nextInt();

		String[] day = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };
		int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		int today = 0;
		for (int i = 0; i < month-1; i++)
			today += days[i];
		today += date;

		System.out.print(day[today % 7]);
	}
}
