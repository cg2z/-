import java.util.Scanner;

public class N03_q11653 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		for(int i=2;i<=num;i++) {
			while(num%i==0) {
				num /= i;
				System.out.println(i);
			}
		}
	}
}
