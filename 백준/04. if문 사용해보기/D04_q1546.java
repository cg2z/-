import java.util.Scanner;

public class D04_q1546 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		double[] score = new double[num];
		double big = 0;
		for (int i = 0; i < num; i++) {
			score[i] = scanner.nextInt();
			if (score[i] >= big)
				big = score[i];
		}
		double sum = 0;
		for (int j = 0; j < num; j++)
			sum += score[j] / big * 100;
		System.out.print(sum/num);
	}
}
