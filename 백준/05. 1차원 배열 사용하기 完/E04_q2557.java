import java.util.Scanner;

public class F02_q2557 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();

		String str = Integer.toString(num*num2*num3);
		int number[] = new int [10];
		

		for (int i = 0; i < str.length(); i++)
			number[(int) str.charAt(i)-48]+=1;
		
		for(int i=0;i<number.length;i++)
			System.out.println(number[i]);
	}
}
