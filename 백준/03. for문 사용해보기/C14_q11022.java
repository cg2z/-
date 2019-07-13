import java.util.Scanner;

public class C14_q11022 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num = scanner.nextInt();
		int arr[] = new int[num];
		int fir[] = new int[num];
		int sec[]=new int[num];

		for (int i = 0; i < num; i++) {
			fir[i] = scanner.nextInt();
			sec[i] = scanner.nextInt();
			arr[i] = fir[i] + sec[i];
		}
		for (int i = 0; i < num; i++)
			System.out.println("Case #"+(i+1)+": "+fir[i]+" + "+sec[i]+" = "+arr[i]);
	}
}
