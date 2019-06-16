import java.util.Scanner;

public class F03_q8958 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num = scanner.nextInt();
		int save[] = new int[num];
		for (int i = 0; i < num; i++) {
			String str = scanner.next();
			int sum = 0;
			int count = 0;
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) == 'O') {
					count++;
					sum += count;
				}
				else if(str.charAt(j)=='X')
					count = 0;
			}
			save[i] = sum;
		}

		for (int k = 0; k < num; k++)
			System.out.println(save[k]);
	}
}
