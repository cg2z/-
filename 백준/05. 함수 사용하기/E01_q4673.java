public class E01_q4673 {
	public static void main(String[] args) {
		int num[] = new int[10001];

		for (int i = 1; i <= 10000; i++) {
			num[i] = i;
			int n = i;
			while(true) {
				if(n==0)break;
				num[i] +=n%10;
				n = n/10;
			}
		}

		for (int j = 1; j <= 10000; j++) {
			int count = 0;
			for (int k = 1; k <= 10000; k++) {
				if (num[k] != j)
					count++;
			}
			if (count == 10000)
				System.out.println(j);
		}
	}
}