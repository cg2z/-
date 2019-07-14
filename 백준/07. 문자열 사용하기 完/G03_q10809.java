import java.util.Scanner;

public class H03_q10809 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String str = scanner.next();
		int alpha[] = new int [26];
		for(int i=0;i<alpha.length;i++) 
			alpha[i]=-1;
		
		for(int i=0;i<str.length();i++) {
			if(alpha[str.charAt(i)-97]==-1)
				alpha[str.charAt(i)-97] = i;
		}
		
		for(int i=0;i<alpha.length;i++) 
			System.out.print(alpha[i]+" ");	
	}
}
