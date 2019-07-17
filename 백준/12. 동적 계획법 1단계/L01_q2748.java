import java.util.Scanner;

public class L01_q2748 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long arr[] = new long[91];
		arr[0]=0;
		arr[1]=1;
		for(int i=2;i<91;i++)
			arr[i]=arr[i-1]+arr[i-2];

		int num = scanner.nextInt();
		System.out.println(arr[num]);
	}
}
