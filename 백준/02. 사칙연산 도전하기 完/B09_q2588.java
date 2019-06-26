import java.util.Scanner;

public class B09_q2588 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		int num2 = scanner.nextInt();
		
		System.out.println(num*(num2%10));
		System.out.println(num*(num2%100/10));
		System.out.println(num*(num2/100));
		System.out.print(num*num2);
	}
}
