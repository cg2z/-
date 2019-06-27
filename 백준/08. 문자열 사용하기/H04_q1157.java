import java.util.Scanner;

public class G04_q1157 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int alpha[] = new int[26];
		String str = scanner.next();
		str = str.toLowerCase();
		
		for (int i = 0; i < str.length(); i++)
			alpha[(int) str.charAt(i) - 97] += 1;

		int big = alpha[0];
		for (int i = 0; i < alpha.length; i++) {
			if(alpha[i]>big)
				big = alpha[i];
		}
		
		int count = 0,index = 0;
		for (int i = 0; i < alpha.length; i++) {
			if(alpha[i]==big) {
				count++;
				index=i;
			}
		}
		if(count>=2)
			System.out.println("?");
		else if(count==1)
			System.out.println((char)(index+65));
	}
}
