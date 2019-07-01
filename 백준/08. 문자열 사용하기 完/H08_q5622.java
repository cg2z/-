import java.util.Scanner;

public class H08_q5622 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String str = scanner.next();
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) <= 'C')
				count += 3;
			else if (str.charAt(i) <= 'F')
				count += 4;
			else if (str.charAt(i) <= 'I')
				count += 5;
			else if (str.charAt(i) <= 'L')
				count += 6;
			else if (str.charAt(i) <= 'O')
				count += 7;
			else if (str.charAt(i) <= 'S')
				count += 8;
			else if (str.charAt(i) <= 'V')
				count += 9;
			else if (str.charAt(i) <= 'Z')
				count += 10;
		}
		System.out.print(count);
	}
}
