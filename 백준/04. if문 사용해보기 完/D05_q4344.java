import java.util.Scanner;

public class D05_q4344 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num = scanner.nextInt();
		double avgover[] = new double[num];

		for (int i = 0; i < num; i++) {
			double person = scanner.nextInt();
			double score[] = new double[(int) person];

			int sum = 0;
			for (int j = 0; j < person; j++) {
				score[j] = scanner.nextInt();
				sum += score[j];
			}
			double avg = sum / person;
			double count = 0;
			for (int k = 0; k < person; k++) {
				if (score[k] > avg)
					count++;
			}
			avgover[i] = count / person * 100;
		}
		for (int l = 0; l < num; l++) {
			System.out.printf("%.3f", avgover[l]);
			System.out.println("%");
		}
	}
}
