import java.util.Scanner;

public class J09_q3053 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double num = scanner.nextDouble();

		System.out.println(String.format("%.6f", num*num*Math.PI));
		System.out.print(String.format("%.6f", 2*num*2*num/2));
	}
}
