import java.util.Scanner;

public class H09_q2941 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String c_str[] = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };
		String str = scanner.next();

		for (int i = 0; i < 8; i++) 
			str = str.replace(c_str[i], "a");
		
		System.out.println(str.length());
	}
}
