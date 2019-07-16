import java.util.Scanner;

public class J03_q7568 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num = scanner.nextInt();
		int rank[] = new int[num];
		int weight[] = new int[num];
		int height[] = new int[num];

		for (int i = 0; i < num; i++) {
			rank[i] = 1;
			weight[i] = scanner.nextInt();
			height[i] = scanner.nextInt();
		}

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (weight[i] > weight[j] && height[i] > height[j]) {
					rank[j]++;
				}
			}
		}
		for (int i = 0; i < num; i++) {
			System.out.print(rank[i] + " ");
		}
	}
}
