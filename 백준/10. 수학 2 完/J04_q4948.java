import java.util.Scanner;

public class J04_q4948 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num[] = new int[246913];

		for (int i = 0; 2 * i <= 246912; i++)
			num[2 * i] = 1;
		num[2] = 0;

		for (int i = 2; i <= 246912; i++) {
			if (num[i] == 0) {
				for (int j = 2; i * j <= 246912; j++)
					num[i * j] = 1;
			}
		}
		
		while(true) {
			int N = scanner.nextInt();
			if(N==0)
				break;
			else {
				int count=0;
				for(int i=N+1;i<=2*N;i++) {
					if(num[i]==0)
						count++;
				}
				System.out.println(count);
			}
		}
	}
}
