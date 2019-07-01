import java.util.Scanner;

public class H10_q1316 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num = scanner.nextInt();
		String str[] = new String[num];
		for (int i = 0; i < num; i++)
			str[i] = scanner.next();

		int countTotal = 0;

		for (int k = 0; k < str.length; k++) {
			int count = 0;
			for (int i = 0; i < str[k].length() - 1; i++) {
				char ch = str[k].charAt(i);
				if (ch != str[k].charAt(i + 1)) {
					for (int j = i + 2; j < str[k].length(); j++) {
						if (ch == str[k].charAt(j))
							count++;
					}
				}
			}
			if (count == 0)
				countTotal++;
		}
		System.out.println(countTotal);
	}
}
