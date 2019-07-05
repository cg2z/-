import java.util.Scanner;

public class C11_q11721 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String str = scanner.next();
		for(int i=0;i<str.length();i++)
		{
			System.out.print(str.charAt(i));
			if ((i+1)%10==0)
				System.out.println();
		}
	}
}