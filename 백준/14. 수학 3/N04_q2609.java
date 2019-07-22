import java.util.Scanner;

public class N04_q2609 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = num*num2;
		
		while(num2!=0){
			int r = num%num2;
			num= num2;
			num2= r;
		}
		System.out.print(num+"\n"+num3/num);
	}
}
