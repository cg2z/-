import java.util.Scanner;
import java.util.StringTokenizer;

public class F01_q1152 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		
		StringTokenizer st = new StringTokenizer(s, " ");
		System.out.println(st.countTokens());
	}
}
