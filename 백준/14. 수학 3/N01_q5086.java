import java.util.Scanner;

public class N01_q5086 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			int num = scanner.nextInt();
			int num2 = scanner.nextInt();
			if (num == 0 && num2 == 0)
				break;
			else {
				if(num2%num==0)
					System.out.println("factor");
				else if(num%num2==0)
					System.out.println("multiple");
				else
					System.out.println("neither");
			}
		}
	}
}
