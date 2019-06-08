import java.util.Scanner;

public class D02_q10817 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();
		int mid = 0;
		if(A>=B&&A<=C||A>=C&&A<=B)
			mid = A;
		else if(B>=A&&B<=C||B>=C&&B<=A)
			mid = B;
		else if (C>=A&&C<=B||C>=B&&C<=A)
			mid = C;
		System.out.print(mid);
	}
}
