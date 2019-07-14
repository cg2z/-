import java.util.Scanner;

public class E02_q10951 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(scanner.hasNextInt()) {
			int num = scanner.nextInt();
			int num2 = scanner.nextInt();

			System.out.println(num+num2);
		}
	}
}
