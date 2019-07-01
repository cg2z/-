import java.util.Scanner;

public class I04_q1193 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num = scanner.nextInt();
		int index = 0, i = 0, count = 0;

		while (num > 0) {
			i++;
			index = num;
			num -= i;
			count++;
		}
		if (count % 2 == 0)
			System.out.println(index + "/" + (count + 1 - index));

		else
			System.out.println((count + 1 - index) + "/" + index);

	}
}
