import java.util.Scanner;

public class E04_q10870 {
	static int f(int n) {
		if(n<=1)
			return n;
		return f(n-1)+f(n-2);
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		System.out.println(f(num));
	}
}
