import java.util.Scanner;

public class F09_q3052 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num[]=new int[10];
		int count=0;
		int count2=0;
		
		for(int i=0;i<10;i++) {
			count2=0;
			num[i]=scanner.nextInt();
			for(int j=0;j<i;j++) {
				if(num[i]%42==num[j]%42)
					count2++;
			}
			if(count2==0)
				count++;
		}
		System.out.print(count);
	}
}
