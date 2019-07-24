import java.util.Scanner;

public class M03_q11399 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num = scanner.nextInt();
		int time[] = new int[num];

		for (int i = 0; i < num; i++)
			time[i] = scanner.nextInt();

		int save = 0;
		for (int i = 0; i < num; i++) {
			for (int j = 1; j < num - i; j++) {
				if (time[j] < time[j - 1]) {
					save = time[j - 1];
					time[j - 1] = time[j];
					time[j] = save;
				}
			}
		}
		int sum=0,result=0;
		for (int i = 0; i < num; i++) {
			sum+=time[i];
			result+=sum;
		}
		System.out.println(result);
	}
}
