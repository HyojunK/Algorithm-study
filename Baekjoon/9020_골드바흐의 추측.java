import java.util.Scanner;

public class Main {
	
	public static boolean[] prime = new boolean[10001];
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		isPrime();
		
		int t = scan.nextInt();
		
		for(int i = 0; i < t; i++) {
			int n = scan.nextInt();
			int a = 0;
			int b = 0;
			int answerChk = 0;
			
			for(int j = n/2; j < n; j++) {
				if(prime[j]) continue;
				if(!prime[j]) b = j;
				
				for(int k = n - j; k >= 1; k--) {
					if(prime[k]) continue;
					if(k + b == n) {
						a = k;
						answerChk = 1;
						break;
					}
				}
				if(answerChk == 1) break;
			}
			System.out.println(a + " " + b);
		}
	}
		
		
	public static void isPrime() {
		prime[0] = prime[1] = true;
		
		for(int i = 2; i <= Math.sqrt(prime.length); i++) {
			if(prime[i]) continue;
			for(int j = i + i; j < prime.length; j += i) {
				prime[j] = true;
			}
		}
	}

}//class end