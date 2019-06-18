import java.util.Scanner;

public class F05_q10039 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int score[]=new int[5];
		int sum=0;
		for(int i=0;i<score.length;i++) {
			int p_score = scanner.nextInt();
			if (p_score<40)
				p_score=40;
			sum+=p_score;
		}
		System.out.print(sum/score.length);
	}
}
