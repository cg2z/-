import java.util.Scanner;

public class F04_q2920 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int asccnt = 0;
		int descnt = 0;
		int song[] = new int[8];
		for (int i = 0; i < song.length; i++) {
			song[i] = scanner.nextInt();
			if (song[i] == i + 1)
				asccnt++;
			else if (song[i] == song.length - i)
				descnt++;
		}
		if (asccnt == 8)
			System.out.print("ascending");
		else if (descnt == 8)
			System.out.print("descending");
		else
			System.out.print("mixed");
	}
}
