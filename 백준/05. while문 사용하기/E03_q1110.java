import java.util.Scanner;

public class D06_q1110 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int count = 0;
		int num3 = num;
		while(true)
		{
			int num1 = num3/10;
			int num2 = num3%10;
			num3 = num2*10+(num1+num2)%10;
			count++;
			
			if(num==num3)
				break;
		}
		System.out.print(count);
	}

}
