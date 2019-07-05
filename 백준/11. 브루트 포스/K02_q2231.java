import java.util.Scanner;

public class K02_q2231 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String str = scanner.next();
		int ans = Integer.parseInt(str);
		int ans2 = 0,count=0;

		for (int i = 0; i < ans; i++) {
			ans2 = i;
			String num = Integer.toString(i);
			for (int j = 0; j < num.length(); j++) 
				ans2 += (int) (num.charAt(j) - 48);
			if (ans2 == ans) {
				System.out.println(i);
				count++;
				break;
			}
		}
		if(count==0)
			System.out.println(0);
	}
}
