import java.util.Scanner;

public class J05_q9020 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num[] = new int[10001];

		for (int i = 0; 2 * i <= 10000; i++)
			num[2 * i] = 1;
		num[2] = 0;

		for (int i = 2; i <= 10000; i++) {
			if (num[i] == 0) {
				for (int j = 2; i * j <= 10000; j++)
					num[i * j] = 1;
			}
		}

		int N = scanner.nextInt();
		int arr[] = new int[N];
		int sNum[] = new int[N];
		int bNum[] = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = scanner.nextInt();
			int save2=0;
			for (int j = 2; j <= arr[i]; j++) {
				int save = 0;

				if (num[j] == 0) {
					if (j <= arr[i] / 2) {
						save = arr[i] - j;
						sNum[i] = j;
					}
					
					if (num[save] == 0) {
						bNum[i] = save;
						save2 = sNum[i];
					}
					else
						sNum[i]=save2;
				}
			}

		}
		for (int i = 0; i < N; i++) {
			System.out.println(sNum[i] + " " + bNum[i]);
		}
	}
}
